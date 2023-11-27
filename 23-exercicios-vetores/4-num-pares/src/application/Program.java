package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = scanner.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		int contPares = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				contPares++;
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + contPares);
		
		scanner.close();
	}

}
