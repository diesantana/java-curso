package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Product> produtos = new ArrayList<>(); 
		
		String path = "c:\\temp\\in.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] filds = line.split(",");
				String name = filds[0];
				double price = Double.parseDouble(filds[1]);
				
				produtos.add(new Product(name, price));
				
				line = br.readLine();
			}
			
			produtos.forEach(System.out::println);
			System.out.println();
			
			
			double averagePrice = produtos.stream()
					.mapToDouble(Product::getPrice) // retorna um stream de preços
					.average()						// calcula a media da stream de preços
					.orElse(0.0);					// seta uma valor padrão, caso a stream de preços esteja vazia.
					
			System.out.printf("Preço médio: %.2f%n", averagePrice);
			
			List<String> lower = produtos.stream()
					.filter(p -> p.getPrice() < averagePrice)
					.map(p -> p.getName())
					.sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
			
			lower.forEach(System.out::println);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
