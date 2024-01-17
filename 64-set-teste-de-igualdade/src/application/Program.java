package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Set<Product> set = new HashSet<Product>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product produto = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(produto));
		
		System.out.println();
		
		
		
		
		Set<Product> setTree = new TreeSet<Product>();
		
		setTree.add(new Product("TV", 900.0));
		setTree.add(new Product("Notebook", 1200.0));
		setTree.add(new Product("Tablet", 400.0));
		
		for (Product p : setTree) {
			System.out.println(p);
		}
		
		
		
		

	}

}
