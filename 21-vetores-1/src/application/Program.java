package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] alturas = new double[n];
		double soma = 0;
		
		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = scanner.nextDouble();
			soma += alturas[i];
		}
		
		double media = soma / alturas.length;
		System.out.printf("AVERAGE HEIGHT = %.2f%n", media);
		
		scanner.close();
	}

}
