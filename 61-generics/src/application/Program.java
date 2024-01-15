package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		try(Scanner sc = new Scanner(System.in);){
			PrintService<Integer> ps = new PrintService<Integer>();
			
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
			System.out.println();
			
			
			
			System.out.println("NOMES: ");
			PrintService<String> ps2 = new PrintService<String>();
			
			System.out.print("Quantos nomes? ");
			quantity = sc.nextInt();
			sc.nextLine();
			for(int i = 0; i < quantity; i++) {
				System.out.print("Digite o " +(i+1) +"º nome: ");
				ps2.addValue(sc.nextLine());
			}
			
			System.out.println();
			String firstName = ps2.first();
			
			ps2.print();
			System.out.println("First: " + firstName);
			System.out.println();
			
						
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}
