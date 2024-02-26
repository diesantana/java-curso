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
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter birthDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDateString = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateString, birthDateFormat);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusString = sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(statusString);
		
		// instanciando o Order
		Order order = new Order(status, new Client(name, email, birthDate));
		
		
		// adiciona os items no order
		System.out.print("How many items to this order? ");
		int numberItems = sc.nextInt();
		for (int i = 0; i < numberItems; i++) {
			System.out.println("Enter #" +(i+1)+ " item data:");
			sc.nextLine(); // consome a linha pendente
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			// instanciando um OrderItem
			OrderItem orderItem = new OrderItem(productQuantity, new Product(productName, productPrice));
			// adiciona o orderItem em Order
			order.addItem(orderItem);
		}
		
		// dados do pedido
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
