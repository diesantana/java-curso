package application;

import java.util.Arrays;

public class Exercicio05 {

	public static void main(String[] args) {
		// Exercício 5: Encontrando o Maior Número
		// Dado um array de inteiros, encontre e imprima o maior número.
		
		int[] numeros = {10, 5, 99, 20, 30, 15};
		
		int maior = Arrays.stream(numeros)
				.max()
				.orElse(0);
		
		System.out.println("Maior número: " + maior);

	}

}
