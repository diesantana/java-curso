package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(3, 4, 5, 10, 7);
		
		
		Stream<Integer> s1 = numeros.stream().map(numero -> numero *2);
		System.out.println(Arrays.toString(s1.toArray())); // [6, 8, 10, 20, 14]
		
		int sum = numeros.stream().reduce(0, (x, y) ->  x + y);
		System.out.println("Soma = " + sum); // Soma = 29
		
		List<Integer> pares10 = numeros.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x *10)
				.collect(Collectors.toList());
		
		System.out.println(pares10); // [40, 100]

	}

}
