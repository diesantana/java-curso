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
			System.out.println("Funcionário #" + i + ":");
			
			System.out.print("Id: ");
			int id = scanner.nextInt();
			
			while(hasId(funcionarios, id)) {
				System.out.println("Este ID já existe! Tente novamente");
				System.out.print("Id: ");
				id = scanner.nextInt();
			}

			System.out.print("Nome: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			
			System.out.print("Salário: ");
			double salary = scanner.nextDouble();
			
			funcionarios.add(new Employees(id, name, salary));
			
			System.out.println();
		}
		
		
		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int idAumento = scanner.nextInt();
		
		Employees funcionarioAumento = funcionarios.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		

		if(funcionarioAumento == null ) {
			System.out.println("Este ID não existe!");
		}
		else {
			System.out.print("Informe a porcentagem: ");
			double porcentagem = scanner.nextDouble();			
			funcionarioAumento.salaryIncrease(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionáios: ");
		
		for(Employees funcionario: funcionarios) {
			System.out.println(funcionario);
		}
		
		scanner.close();
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null; 
		// emp não é nulo? True não é nulo, o funcionário existe | False: é nulo o funcionário não existe;
	}

}
