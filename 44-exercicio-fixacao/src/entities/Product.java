package entities;

import java.time.format.DateTimeFormatter;

public class Product {
	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String priceTag() {
		return String.format("%s $ %.2f", name, price);
	}
	
	public static DateTimeFormatter getDateFormat() {
		return DateTimeFormatter.ofPattern("dd/MM/yyyy");
	}
	
	
}
