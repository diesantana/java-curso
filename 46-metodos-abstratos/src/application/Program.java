package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes: ");
		int qtdShapes = scanner.nextInt();
		
		for(int i = 0; i < qtdShapes; i++) {
			System.out.println("Shape #" +(i+1)+ " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char type = scanner.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(scanner.next());
			
			if(type == 'r') {
				System.out.print("Width: ");
				Double width = scanner.nextDouble();
				System.out.print("Height: ");
				Double height = scanner.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
			} else if(type == 'c') {
				System.out.print("Radius: ");
				Double radius = scanner.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}else {
				System.err.println("ERRO NO TIPO DA FORMA: VOCÊ DEVE INFORMAR 'r' ou 'c'");
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape s: shapes) {
			System.out.printf(String.format("%.2f", s.area()));
		}
		
		
		scanner.close();
	}

}
