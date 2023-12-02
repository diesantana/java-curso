package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int qtdFuncionarios = scanner.nextInt();
		
		List<Employees> funcionarios = new ArrayList<>();
		
		System.out.println();
		
		for(int i = 1; i <= qtdFuncionarios; i++) {
			System.out.println("Funcionário #" + i);
			
			System.out.print("Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Nome: ");
			String name = scanner.nextLine();
			
			System.out.print("Salário: ");
			double salary = scanner.nextDouble();
			
			funcionarios.add(new Employees(id, name, salary));
			
			System.out.println();
		}
		
		int indiceDoIdAumento = -1;
		
		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int idAumento = scanner.nextInt();
		
		
		
		for(int i = 0; i < funcionarios.size(); i++) {
			if(funcionarios.get(i).getId() == idAumento) {
				indiceDoIdAumento = i;
			}
		}
		
		if(indiceDoIdAumento < 0) {
			System.out.println("Este ID não existe!");
		}
		else {
			System.out.print("Informe a porcentagem: ");
			int porcentagem = scanner.nextInt();			
			funcionarios.get(indiceDoIdAumento).salaryIncrease(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionáios: ");
		
		for(Employees funcionario: funcionarios) {
			System.out.println(funcionario);
		}
		
		scanner.close();
	}

}
