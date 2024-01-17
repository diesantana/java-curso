package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Users;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Users> users = new HashSet<Users>();

		System.out.print("Digite o caminho completo do arquivo: ");
		String path = sc.next();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String userName = line.split(" ")[0];
				String userDate = line.split(" ")[1];

				Instant date = Instant.parse(userDate);
				users.add(new Users(userName, date));

				line = br.readLine();
			}

			// Cria um conjunto vazio
			Set<String> existingNames = new HashSet<>();
			// Remove usuários duplicados
			users.removeIf(user -> !existingNames.add(user.getName()));
			/*
			 * userSet.removeIf(...): Esta parte do código remove usuários do conjunto
			 * userSet com base em uma condição. user -> !existingNames.add(user.getName()):
			 * Aqui estamos usando um lambda (expressão funcional) para definir a condição.
			 * Vamos quebrar isso ainda mais: user.getName(): Obtém o nome do usuário atual.
			 * existingNames.add(...): Tenta adicionar o nome ao conjunto existingNames.
			 * Retorna true se o nome não estava presente no conjunto e foi adicionado com
			 * sucesso. Retorna false se o nome já estava presente. !existingNames.add(...):
			 * O operador ! inverte o resultado. Portanto, a condição se torna verdadeira
			 * (true) se o nome já está presente e falso (false) se o nome não está
			 * presente. O método removeIf remove usuários onde a condição é verdadeira, ou
			 * seja, remove usuários que têm o mesmo nome que já encontramos anteriormente.
			 */

			int totalUsers = users.size();

			System.out.println("Total de usuários: " + totalUsers);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
