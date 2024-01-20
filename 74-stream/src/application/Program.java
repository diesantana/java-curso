package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		Stream<Integer> st1 = list.stream().map(x -> x*4);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> s2 = Stream.of("Alice", "Maria", "Jose");
		System.out.println(Arrays.toString(s2.toArray()));
		
		Stream<Integer> s3 = Stream.iterate(5, x -> x +5);
		System.out.println(Arrays.toString(s3.limit(10).toArray()));

	}

}
