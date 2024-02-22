package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			// verifica se o ID já existe
			while (checkId(employees, id)) {
				System.out.print("The Id already exists, enter ANOTHER Id: ");
				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int idIncrease = sc.nextInt();

		// verifica se o ID existe
		if (!checkId(employees, idIncrease)) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			// aplica o aumento
			for (Employee emp : employees) {
				if (emp.getId() == idIncrease) {
					emp.increaseSalary(percentage);
				}
			}
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		sc.close();
	}

	// função para verificar se o ID existe
	public static boolean checkId(List<Employee> list, int id) {
		for (Employee emp : list) {
			if (emp.getId() == id) {
				return true;
			}
		}
		return false;
	}

}
