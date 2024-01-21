package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Digite o caminho completo do arquivo: ");
		String path = sc.next();
		System.out.print("Digite o salário: ");
		double enterSalary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] filds = line.split(",");
				String name = filds[0];
				String email = filds[1];
				double salary = Double.parseDouble(filds[2]);
				emp.add(new Employee(name, email, salary));
				line = br.readLine();
			}
			
			System.out.printf("Email de pessoas cujo salário é superior a %.2f: %n", enterSalary);
			List<String> emails = emp.stream()
					.filter(p -> p.getSalary() > enterSalary)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = emp.stream()
					.filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce((x, y) -> x + y)
					.orElse(0.0);
			
			System.out.printf("Soma do salário das pessoas cujo nome começa com 'M': %.2f%n",sum);
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
