package util;

import entities.Product;

public class MyClass {
	public static void updatePrice(Product p) {
		p.setPrice(p.getPrice() * 1.10);
	}
}
