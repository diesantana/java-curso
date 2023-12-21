package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int qtdEmployees = scanner.nextInt();
		
		for(int i = 0; i < qtdEmployees; i++) {
			System.out.println("Employee #" +(i+1)+ "data:");
			
			scanner.nextLine();
			System.out.print("Outsourced (y/n)?");
			char isOutsourced = scanner.next().charAt(0);
			
			if(isOutsourced == 'y') {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				
				System.out.print("Hours: ");
				int hours = scanner.nextInt();
				
				System.out.print("Value per hour: ");
				double valuePerHour = scanner.nextDouble();
				
				System.out.print("Additional charge: ");
				double additionalCharge = scanner.nextDouble();
				
				employees.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else{
				System.out.print("Name: ");
				String name = scanner.nextLine();
				
				System.out.print("Hours: ");
				int hours = scanner.nextInt();
				
				System.out.print("Value per hour: ");
				double valuePerHour = scanner.nextDouble();
				
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		scanner.close();
	}

}
