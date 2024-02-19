package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary =  sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		System.out.println();
		
		Employee emp = new Employee(name, grossSalary, tax);
		System.out.println(emp);
		System.out.println();
		
		System.out.print("Witch percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		
		System.out.println("Update data: " + emp);
		
		sc.close();
	}

}
