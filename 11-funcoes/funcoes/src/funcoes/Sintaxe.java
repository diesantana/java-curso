package funcoes;

import java.util.Scanner;

public class Sintaxe {

	public static void main(String[] args) {
		// Problema exemplo
		// Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
		Scanner lerDados = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = lerDados.nextInt();
		int b = lerDados.nextInt();
		int c = lerDados.nextInt();
		
		int heigher = max(a, b, c);
		showResult(heigher);
		
		
		lerDados.close();
	}
	
	public static int max(int x, int y, int z) {
		// lógica da função aqui
		int maiorValor;
		
		if(x > y && x > z) {
			maiorValor = x;
		} else if(y > z) {
			maiorValor = y;
		}else {
			maiorValor = z;
		}
		
		return maiorValor;
	}
	
	public static void showResult(int x) {
		System.out.println("Higher = "+x);
	}
	
	
	
	
}
