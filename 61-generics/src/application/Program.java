package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try(Scanner sc = new Scanner(System.in);){
			PrintService ps = new PrintService();
			
			System.out.print("Quantos valores? ");
			int quantity = sc.nextInt();
			
			for(int i = 0; i < quantity; i++) {
				System.out.print("Digite o " +(i+1) +"º valor: ");
				ps.addValue(sc.nextInt());
			}
			
			System.out.println();
			
			int first = ps.first();
			
			ps.print();
			System.out.println("First: " + first);
						
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
