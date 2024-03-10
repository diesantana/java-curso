package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
import util.MyPredicate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		for (Product product : list) {
			System.out.println(product);
		}
		System.out.println();
		
		// Classe que implementa um predicate
		//list.removeIf(new MyPredicate());
		
		// Reference method em métodos estáticos
		//list.removeIf(Product::staticTeste);
		
		// Reference method em métodos de instancia 
		//list.removeIf(Product::instanceTeste);
		
		// Expressão lambda declarada
		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);
		
		// Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product product : list) {
			System.out.println(product);
		}
	}

}
