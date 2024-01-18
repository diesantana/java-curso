package application;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		Map<String, Integer> people = new TreeMap<String, Integer>();
		people.put("Alice", 20);
		people.put("Bob", 32);
		
		System.out.println(people);
		
		people.remove("Bob");
		boolean contemElemento = people.containsKey("Alice");
		boolean contemIdade = people.containsValue(20);
		System.out.println(contemIdade);
		System.out.println(people);
		
		System.out.println(people.get("Maria"));
		
		System.out.println(people.size());
		
		people.put("John", 20);
		people.put("Maria", 32);
		people.put("Miken", 50);
		people.put("Dico", 26);
		
		Set<String> peopleNomes = people.keySet();
		System.out.println(peopleNomes);
		
		
	}
}	
