package application;

import java.util.Arrays;
import java.util.List;

public class Exercicio03 {

	public static void main(String[] args) {
		// Exercício 3: Contagem de Elementos
		// Dada uma lista de strings, conte o número de elementos na lista.
		
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		long count = list.stream().count();
		
		System.out.println("Total de elementos: " + count);

	}

}
