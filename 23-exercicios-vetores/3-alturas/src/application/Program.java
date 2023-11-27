package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoa serão digitadas? ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Person[] pessoas = new Person[n];
		
		
		String nome;
		int idade;
		double altura;
		double somaTodasAlturas = 0;
		double mediaAlturas;
		int menor16 = 0;
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			
			System.out.print("Nome: ");
			nome = scanner.nextLine();
			System.out.print("Idade: ");
			idade = scanner.nextInt();
			System.out.print("Altura: ");
			altura = scanner.nextDouble();
			scanner.nextLine();
			pessoas[i] = new Person(nome, idade, altura);
			
			somaTodasAlturas += pessoas[i].getHeight();
			
			if(pessoas[i].getAge() < 16) {
				menor16++;
			}
			
		}
		
		String[] menor16Nomes = new String[menor16];
		int indiceMenor16 = 0;
		for(int i = 0; i < pessoas.length; i++) {
			if(pessoas[i].getAge() < 16) {
				menor16Nomes[indiceMenor16] = new String(pessoas[i].getName());
				indiceMenor16++;
			}
		}
		
		
		mediaAlturas = somaTodasAlturas / pessoas.length;
		
		double porcentoMenor16 = (menor16 * 100.0) / pessoas.length; 
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n",mediaAlturas);
		System.out.println("Pessoas com menos de 16 anos: " +porcentoMenor16+"%");
		
		for(String nomeMenor16: menor16Nomes) {
			System.out.println(nomeMenor16);
		}
		
		
		
		scanner.close();	
	}

}
