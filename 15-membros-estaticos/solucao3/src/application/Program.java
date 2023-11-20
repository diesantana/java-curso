package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	// Versão 3: classe Calculator com método estático

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double raio = scanner.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		System.out.printf("Cirfumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		scanner.close();
	}

}
