package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = scanner.nextInt();
		
		double[] numeros = new double[n];
		double soma = 0;
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = scanner.nextDouble();
			soma += numeros[i];
		}
		
		double media = soma / numeros.length;
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		scanner.close();
	}

}
