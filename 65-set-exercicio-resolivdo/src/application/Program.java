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
				String[] lineArray = line.split(" ");
				String userName = lineArray[0];
				Instant date = Instant.parse(lineArray[1]);
				Users currentUser = new Users(userName, date);

				if (!users.contains(currentUser)) {
					users.add(currentUser);
				}
				line = br.readLine();
			}

			int totalUsers = users.size();

			System.out.println("Total de usuários: " + totalUsers);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
