package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<TaxPayer>();
		 
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			Double annual = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health Expenditures: ");
				Double health = sc.nextDouble();
				taxPayers.add(new PhysicalPerson(name, annual, health));
			} else {
				System.out.print("number of employees: ");
				Integer number = sc.nextInt();
				taxPayers.add(new LegalPerson(name, annual, number));
			}
		}
		
		System.out.println();
		System.out.println("TAXEX PAID:");
		for (TaxPayer t : taxPayers) {
			System.out.println(t);
		}
		
		double totalTaxes = 0.0;
		for (TaxPayer t : taxPayers) {
			totalTaxes += t.taxCalculation();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		
		
		
		sc.close();
	}

}
