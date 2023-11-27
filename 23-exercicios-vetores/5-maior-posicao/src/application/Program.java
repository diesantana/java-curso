package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?  ");
		int n = scanner.nextInt();
	
		double[] numeros = new double[n];
		
		double maiorValor = 0;
		int indexMaiorValor = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = scanner.nextDouble();
			if(numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				indexMaiorValor = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + indexMaiorValor);
		
		scanner.close();
	}

}
