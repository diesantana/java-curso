package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> students = new TreeSet<Integer>();
		
		System.out.print("Quantos estudantes para o curso A? ");
		int quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Digite o " +(i+1)+ "º aluno: ");
			int student = sc.nextInt();
			students.add(student);
		}
		
		System.out.print("Quantos estudantes para o curso B? ");
		quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Digite o " +(i+1)+ "º aluno: ");
			int student = sc.nextInt();
			students.add(student);
		}
		
		System.out.print("Quantos estudantes para o curso C? ");
		quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Digite o " +(i+1)+ "º aluno: ");
			int student = sc.nextInt();
			students.add(student);
		}
		
		
		
		System.out.println("Total de alunos: " + students.size());
		
		
		sc.close();
	}

}
