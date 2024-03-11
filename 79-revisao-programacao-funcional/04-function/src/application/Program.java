package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collector;
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
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = products.stream().map(Product::upperCaseName).collect(Collectors.toList());
		//List<String> names = products.stream().map(func).collect(Collectors.toList());
		
		List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
