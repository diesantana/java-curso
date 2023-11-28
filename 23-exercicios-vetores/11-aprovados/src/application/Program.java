package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = scanner.nextInt();
		
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double [n];

		for(int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " +(i+1)+"o aluno: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			nomes[i] = new String(nome);
			nota1[i] = scanner.nextDouble();
			nota2[i] = scanner.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < n; i++) {
			double media = (nota1[i] + nota2[i]) / 2;
			if(media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		scanner.close();
	}

}
