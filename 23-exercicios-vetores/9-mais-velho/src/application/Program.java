package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] pessoaNome = new String[n];
		int[] pessoaIdade = new int[n];
		int indexMaisVelho = 0;
		int valorMaisVelho = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da " +(i+1)+"a pessoa: ");
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			pessoaNome[i] = new String(nome);
			
			System.out.print("Idade: ");
			pessoaIdade[i] = scanner.nextInt();
			scanner.nextLine();
			
			if(pessoaIdade[i] > valorMaisVelho) {
				valorMaisVelho = pessoaIdade[i];
				indexMaisVelho = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + pessoaNome[indexMaisVelho]);
		
		scanner.close();
	}

}
