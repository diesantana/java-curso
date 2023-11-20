package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	// Versão 2: classe Calculator com membros de instância
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.print("Enter radius: ");
		calc.raio = scanner.nextDouble();
		System.out.printf("Circumference: %.2f%n", calc.circunferencia());
		System.out.printf("Volume: %.2f%n", calc.volume());
		System.out.printf("PI value: %.2f%n", calc.PI);

		scanner.close();
	}

}
