package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o preço do dolar? ");
		double precoDolar = scanner.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double dolarComprados = scanner.nextDouble();
		double valorEmReais = CurrencyConverter.valorFinal(precoDolar, dolarComprados);
		System.out.printf("Valor a ser pago em reais = %.2f%n", valorEmReais);
		
		scanner.close();
	}

}
