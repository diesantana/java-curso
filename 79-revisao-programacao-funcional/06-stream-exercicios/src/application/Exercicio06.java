package application;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercicio06 {

	public static void main(String[] args) {
		// Exercício 6: Sequência de Fibonacci com Stream
		// Crie um programa que gere os primeiros 10 números da sequência de Fibonacci utilizando streams.
		
		Stream<Long> fibonacci = Stream.iterate(new long[] {0L, 1L}, fib -> new long[] {fib[1], fib[0]+fib[1]})
				.map(fib -> fib[0]);
		System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));

	}

}
