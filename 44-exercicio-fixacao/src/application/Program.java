package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int qtdProducts = scanner.nextInt();
		
		for(int i = 1; i <= qtdProducts; i++) {
			System.out.println("Product #" +i+ " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = scanner.next().charAt(0);
			scanner.nextLine();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			scanner.nextLine();
			
			if(type == 'c') {
				products.add(new Product(name, price));
			}else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufacture = LocalDate.parse(scanner.next(), Product.getDateFormat());
				products.add(new UsedProduct(name, price, manufacture));
				
			}else {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p: products) {
			System.out.println(p.priceTag());
		}
		
		
		
		scanner.close();
	}

}
