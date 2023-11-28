package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = scanner.nextInt();
		
		Person[] pessoas = new Person[n];
		
		double menorAltura = 3.0;
		double maiorAltura = 0.0;
		double somaMulheres = 0.0;
		int qtdMulheres = 0;
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			double altura = scanner.nextDouble();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			char genero = scanner.next().charAt(0);
			
			pessoas[i] = new Person(altura, genero);
			
			if(pessoas[i].getHeight() < menorAltura) {
				menorAltura = pessoas[i].getHeight();
			}
			if(pessoas[i].getHeight() > maiorAltura) {
				maiorAltura = pessoas[i].getHeight();
			}
			if(pessoas[i].getGender() == 'F') {
				qtdMulheres++;
				somaMulheres += pessoas[i].getHeight();
			}
			
		}
		
		double mediaMulheres = somaMulheres / qtdMulheres;
		int qtdHomens = pessoas.length - qtdMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Numero de homens = " + qtdHomens);
		
		scanner.close();
	}

}
