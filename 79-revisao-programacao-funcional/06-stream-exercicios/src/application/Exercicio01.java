package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/* Exercício 1: Filtrando Números Pares
		Dado um array de inteiros, filtre apenas os números pares e imprima-os. */
		
		System.out.println("Números pares:");
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Arrays.stream(numeros)
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);
	}

}
