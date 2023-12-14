package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = scanner.nextLine();
		Department department = new Department(departmentName);
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String name = scanner.nextLine();

		
		System.out.print("Level: ");
		String level = scanner.nextLine();
		WorkerLevel workerLevel = WorkerLevel.valueOf(level);
		
		
		System.out.print("Base salary: ");
		Double salary = scanner.nextDouble();
		
		Worker worker = new Worker(name, workerLevel, salary, department);
		
		System.out.print("How many contracts to this worker? ");
		int qtdContracts = scanner.nextInt();
		
		for(int i = 0; i < qtdContracts; i++) {
			System.out.println("Enter constract #"+(i+1)+" data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			scanner.nextLine();
			String dateString = scanner.next();
			LocalDate dateContract = LocalDate.parse(dateString, formatDate);
			
			System.out.print("Value per hour: ");
			double valueHour = scanner.nextDouble();
			
			System.out.print("Duration (hours): ");
			int durationHour = scanner.nextInt();
			
			HourContract currentContract= new HourContract(dateContract, valueHour, durationHour);
			
			worker.addContract(currentContract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		scanner.nextLine();
		String monthAndYear = scanner.next();
		LocalDate monthAndYearDate = LocalDate.parse("01/"+ monthAndYear, formatDate);
		
		
		double calcSalary = worker.income(monthAndYearDate.getYear() ,monthAndYearDate.getMonthValue());

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment());
		System.out.printf("Income for %s: %.2f%n",monthAndYear, calcSalary);
		scanner.close();
	}

}
