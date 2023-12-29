package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			String[] vetor = scanner.nextLine().split(" ");
			int position = scanner.nextInt();
			System.out.println(vetor[position]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index does not exist in array");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input! Enter numbers only");
		}
		
		System.out.println("End of program");
		
		scanner.close();
	}
}
