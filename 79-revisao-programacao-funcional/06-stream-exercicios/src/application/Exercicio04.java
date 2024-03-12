package application;

import java.util.Arrays;
import java.util.List;

public class Exercicio04 {

	public static void main(String[] args) {
		// Exercício 4: Concatenando Strings
		//Dada uma lista de strings, concatene todas as strings em uma única string, separadas por vírgula.
		
		List<String> list = Arrays.asList("Java", "Phyton", "C#", "JavaScript");
		String result = list.stream()
				.reduce("", (acc, str) -> acc + str + ", ");

		// remove a vírgula no final da string
		String formattedResult = result.substring(0, (result.length() -2));
		System.out.println("Strings concatenadas: " + formattedResult);
	}

}
