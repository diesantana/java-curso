package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
		
	}
	
	public static void method1() {
		System.out.println("*** METHOD 1 START ***");
		method2();
		System.out.println("*** METHOD 1 END ***");
	}
	
	public static void method2() {
		System.out.println("*** METHOD 2 START ***");
		Scanner scanner = new Scanner(System.in);
		
		try {
			String[] vetor = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vetor[position]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("Index does not exist in array");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input! Enter numbers only");
			e.printStackTrace();
		}
		
		scanner.close();
		System.out.println("*** METHOD 2 END ***");
	}
}
