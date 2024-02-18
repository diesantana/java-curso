package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		Rectangle rec = new Rectangle(width, height);
		
		double area = rec.area();
		double perimeter = rec.perimeter();
		double diagonal = rec.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		
		sc.close();
	}

}
