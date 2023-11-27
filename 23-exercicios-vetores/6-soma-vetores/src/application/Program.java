package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scanner.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			c[i] += a[i];
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < b.length; i++) {
			b[i] = scanner.nextInt();
			c[i] += b[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int valores: c) {
			System.out.println(valores);
		}
 		
		
		scanner.close();
	}

}
