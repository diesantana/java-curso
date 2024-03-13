package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String pathStr = sc.nextLine();
		File path = new File(pathStr);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] filds = line.split(",");
				String name = filds[0];
				double price = Double.parseDouble(filds[1]);
				
				products.add(new Product(name, price));
				line = br.readLine();
			}
			
			Double average = products.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (acc, value) -> acc + value) / products.size();
			
			System.out.printf("Average price: %.2f%n", average);
			
			Comparator<String> comp = (s1, s2) -> -s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = products.stream()
					.filter(p -> p.getPrice() < average)
					.map(p -> p.getName())
					.sorted(Comparator.reverseOrder())
					//.sorted(comp)
					.toList();
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
		
		
		sc.close();
	}

}
