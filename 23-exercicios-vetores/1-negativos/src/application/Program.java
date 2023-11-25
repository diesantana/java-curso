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
			int numero = scanner.nextInt();
			numeros[i] = numero;
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for(int i = 0; i < numeros.length ; i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		
		
		scanner.close();
	}

}
