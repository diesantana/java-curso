package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// consome a quebra de linha deixada pelo nextInt
		scanner.nextLine();
		Product[] produtos = new Product[n];
		double soma = 0;
		
		
		for(int i = 0; i < produtos.length; i++) {
			String name = scanner.nextLine();
			double price = scanner.nextDouble();
			scanner.nextLine();
			produtos[i] = new Product(name, price);
			soma += produtos[i].getPrice();
		}
		
		double media = soma / produtos.length;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", media);
		
		scanner.close();
	}

}
