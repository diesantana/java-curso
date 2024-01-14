package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.csv";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			String linha = bf.readLine();
			
			while(linha != null) {
				String name = linha.split(",")[0];
				double salary = Double.parseDouble(linha.split(",")[1]);
				list.add(new Employee(name, salary));
				linha = bf.readLine();
			}
			
			// ordena a lista 
			Collections.sort(list);
			
			// imprime os itens na tela
			for (Employee emp: list) {
				System.out.println(emp);
			}
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
