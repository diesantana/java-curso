package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Visitant;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Visitant[] hospedes = new Visitant[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = scanner.nextInt();
		scanner.nextLine();
	
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent #"+ (i+1)+":");
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Email: ");
			String email = scanner.nextLine();
			
			System.out.print("Room: ");
			int room = scanner.nextInt();
			scanner.nextLine();
		
			System.out.println();
			hospedes[room] = new Visitant(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < hospedes.length; i++) {
			if(hospedes[i] != null) {
				System.out.println(i+": "+hospedes[i]);
			}
		}
		
		scanner.close();
	}

}
