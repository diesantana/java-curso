package application;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "bob@gmail.com");
		
		System.out.println(c1.hashCode()); // 74113781
		System.out.println(c2.hashCode()); // 66996
		
		System.out.println(c1.equals(c2)); // false
		
	}
	
}
 