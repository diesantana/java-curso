package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[][] numeros = new int[n][n];
		int qtdNegative = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = scanner.nextInt();
				if(numeros[i][j] < 0) {
					qtdNegative++;
				}
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + qtdNegative);
		
		scanner.close();
	}

}
