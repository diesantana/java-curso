package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scanner.nextInt();
		
		int[] numeros = new int[n];
		int somaPares = 0;
		int contPares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = scanner.nextInt();
			if(numeros[i] % 2 == 0) {
				somaPares += numeros[i];
				contPares++;
			}
		}
		
		double media = (double) somaPares / contPares;
		
		if(contPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.printf("MEDIA PARES = %.1f%n", media);
		}
		
		scanner.close();
	}

}
