package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.MyConsumer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("TV", 900.0));
		products.add(new Product("Mouse", 50.0));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));
		
		products.forEach(System.out::println);
		System.out.println();
		
		Consumer<Product> myConsumer = p -> p.setPrice(p.getPrice() * 1.10);
		
		products.forEach(p -> p.setPrice(p.getPrice() * 1.10));
		products.forEach(System.out::println);
	}

}
