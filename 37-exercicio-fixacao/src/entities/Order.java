package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter dateBirthFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime moment = LocalDateTime.now();
	private OrderStatus status;
	
	private Client client = new Client();
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public List<OrderItem> getItems() {
		return items;
	} 
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum  = 0;
		for(OrderItem item: items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("ORDER SUMMARY:\n");
		sb.append("Oder moment: " + moment.format(dateFormat)+"\n");
		sb.append("Order status: " + status +"\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + client.getBirthDate().format(dateBirthFormat) +") - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order Items: \n");
		for(OrderItem item: items) {
			sb.append(item +"\n");
		}
		sb.append(String.format("Total price: $%.2f", total()));
		
		
		return sb.toString();
	}
	
	
	
}
