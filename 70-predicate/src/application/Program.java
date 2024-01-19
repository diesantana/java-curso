package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> produtos = new ArrayList<>();
		
		produtos.add( new Product("Tv", 900.0));
		produtos.add( new Product("Mouse", 50.0));
		produtos.add( new Product("Tablet", 350.0));
		produtos.add( new Product("HD Case", 80.90));
		
		for (Product product : produtos) {
			System.out.println(product);
		}
		System.out.println();
		
		
		
		produtos.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product product : produtos) {
			System.out.println(product);
		};

	}

}
