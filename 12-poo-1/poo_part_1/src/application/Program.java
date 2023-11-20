package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner lerDados = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Enter the measures of triangle X:");
		x.a = lerDados.nextDouble();
		x.b = lerDados.nextDouble();
		x.c = lerDados.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = lerDados.nextDouble();
		y.b = lerDados.nextDouble();
		y.c = lerDados.nextDouble();
		
		double xArea = x.area();
		System.out.printf("Triangle X area: %.4f%n", xArea);
		
		double yArea = y.area();
		System.out.printf("Triangle Y area: %.4f%n", yArea);
		
		if(xArea > yArea) {
			System.out.println("Larger Area: X");
		} else {
			System.out.println("Larger Area: Y");
		}
		
		lerDados.close();
	}

}
