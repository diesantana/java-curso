package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		LocalDateTime data = LocalDateTime.parse("2023-12-12T11:03:34.310416");
		DateTimeFormatter formatacao1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dateFormat = data.format(formatacao1);


		Order pedido = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(pedido);
		
		Order pedido2 = new Order(1081, dateFormat, OrderStatus.SHIPPED);
		System.out.println(pedido2);
		
		OrderStatus status1 = OrderStatus.DELIVERED;
		OrderStatus status2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(status1);
		System.out.println(status2);
		
	}

}
