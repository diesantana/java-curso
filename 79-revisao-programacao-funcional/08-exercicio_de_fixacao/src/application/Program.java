package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Enter full file path: ");
		//String pathStr = sc.nextLine();
		List<Employee> employees = new ArrayList<Employee>();
		String pathStr = "c:\\temp\\in.csv";
		File path = new File(pathStr);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] filds = line.split(",");
				String name = filds[0];
				String email = filds[1];
				double price = Double.parseDouble(filds[2]);
				
				employees.add(new Employee(name, email, price));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salaryQuery = sc.nextDouble();
			
			// mostrar em ordem o email dos emp cujo salary > salaryQuery 
			List<String> emails = employees.stream()
					.filter(emp -> emp.getSalary() > salaryQuery)
					.map(emp -> emp.getEmail())
					.sorted()
					.toList();
			
			System.out.printf("Email of people whose salary is more than $ %.2f:%n", salaryQuery);
			emails.forEach(System.out::println);
			
			double sum = employees.stream()
					.filter(emp -> emp.getName().charAt(0) == 'M')
					.map(emp -> emp.getSalary())
					.reduce(0.0, (acc, value) -> acc + value);
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
