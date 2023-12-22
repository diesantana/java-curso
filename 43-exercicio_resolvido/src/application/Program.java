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
		
		System.out.print("Enter the number of employees: ");
		int qtdEmployees = scanner.nextInt();
		
		for(int i = 0; i < qtdEmployees; i++) {
			System.out.println("Employee #" +(i+1)+ "data:");
			
			System.out.print("Outsourced (y/n)? ");
			char isOutsourced = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Hours: ");
			int hours = scanner.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = scanner.nextDouble();
			
			if(isOutsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = scanner.nextDouble();
				employees.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else{
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(Employee emp: employees) {
			System.out.println(emp);
		}
		
		scanner.close();
	}

}
