package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		char[] gender = new char[n]; 
		double[] heights = new double[n];
		
		// add os elementos no vetor
		for(int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i+1) +"a pessoa: ");
			heights[i] = sc.nextDouble();
			System.out.println("Genero da " + (i+1) +"a pessoa: ");
			gender[i] = sc.next().charAt(0);
		}
		
		// menor altura
		double lowerHeight = Arrays.stream(heights).min().orElse(0);
		// maior altura
		double upperHeight = Arrays.stream(heights).max().orElse(0);
		
		// media das mulheres
		
		double averageWomen = 0.0;
		int numerWomen = 0;
		for(int i = 0; i < n; i++) {
			if(gender[i] == 'F') {
				averageWomen += heights[i];
				numerWomen ++; 
			}
		}
		averageWomen = averageWomen / numerWomen;
		
		// quantidade de homens
		int numberMen = 0;
		for (int i = 0; i < gender.length; i++) {
			if(gender[i] == 'M') numberMen++;
		}
		
		System.out.printf("Menor altura = %.2f%n", lowerHeight);
		System.out.printf("Maior altura = %.2f%n", upperHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", averageWomen);
		System.out.println("Numero de homens = " + numberMen);
		sc.close();
		
	}

}
