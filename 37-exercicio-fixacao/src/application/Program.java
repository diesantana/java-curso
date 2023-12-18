package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter birthDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birth = scanner.next();
		LocalDate birthDate = LocalDate.parse(birth, birthDateFormat);
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusText = scanner.next();
		OrderStatus status = OrderStatus.valueOf(statusText);
		
		Order order = new Order(status, client);
		
		System.out.print("How many items to this order? ");
		Integer qtdItems = scanner.nextInt();
		
		for(int i = 0; i < qtdItems; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			
			scanner.nextLine();
			System.out.print("Product name: ");
			String productName = scanner.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = scanner.nextDouble();
			
			System.out.print("Quantity: ");
			Integer quantity = scanner.nextInt();
			
			// criando um OrderItem
			OrderItem item = new OrderItem(quantity, new Product(productName, productPrice));
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		
		scanner.close();
	}

}
