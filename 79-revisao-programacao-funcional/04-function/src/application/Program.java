package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCase;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));
		
		products.forEach(System.out::println);
		System.out.println();
		
		List<String> names = products.stream().map(Product::staticUpperCase).collect(Collectors.toList());;
		names.forEach(System.out::println);
	}

}
