package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Taxpayer> taxpayers = new ArrayList<>();
		
		System.out.print("Enter the number of Taxpayers: ");
		int nTaxpayers = scanner.nextInt();
		
		for(int i = 0; i < nTaxpayers; i++) {
			System.out.println("Taxpayer #" +(i+1)+ " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char type = scanner.next().charAt(0);
			scanner.nextLine();

			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = scanner.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = scanner.nextDouble();
				taxpayers.add(new PhysicalPerson(name, annualIncome, expenditures));
			}else if(type == 'c') {
				System.out.print("Number of employees: ");
				int nEmployees = scanner.nextInt();
				taxpayers.add(new LegalPerson(name, annualIncome, nEmployees));
			} 
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		
		for(Taxpayer t: taxpayers) {
			System.out.println(t);
			sum += t.calcTax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		
		scanner.close();
	}

}
