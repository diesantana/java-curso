package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Exercício 2: Mapeamento de Nomes
		Dada uma lista de nomes, converta todos os nomes para letras maiúsculas e imprima-os. */
		
		List<String> names = Arrays.asList("Ana", "João", "Maria", "Pedro");
		
		List<String> upperNames = names.stream()
					.map(name -> name.toUpperCase())
					.collect(Collectors.toList());
		
		upperNames.forEach(System.out::println);
	}

}
