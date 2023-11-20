package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	// Versão 1: métodos na própria classe do programa

	public static final double PI = 3.14159; // CONSTANTE

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double raio = scanner.nextDouble();
		double c = circunferecia(raio);
		double v = volume(raio);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);

		scanner.close();
	}

	public static double circunferecia(double raio) {
		return 2.00 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.00 * PI * Math.pow(raio, 3) / 3;
	}

}
