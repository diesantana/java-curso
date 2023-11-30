package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		// Adicionando elementos a lista
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Ana");
		
		// Adicionando um elemento passando o índice
		lista.add(2, "Marco");
		
		// removendo um elemento pelo índice
		// lista.remove(0);
		
		// removendo  um elemento pelo objeto
		//lista.remove("Bob");
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		
		//numeros.remove(Integer.valueOf(10));
		
		/*for(Integer n: numeros) {
			System.out.println(n);
		}*/
		
		
		List<Double> numeros2 = new ArrayList<>();
		numeros2.add(20.0);
		numeros2.add(2.0);
		numeros2.add(200.0);
		
		//numeros2.remove(2);
		//numeros2.remove(Double.valueOf(2));
		
		
		/*for(Double n : numeros2) {
			System.out.println(n);
		}*/
		
		for(String nomes: lista) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------");
		
		// removendo um elemento utilizando um predicado
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		// Tamanho da lista
		// System.out.println(lista.size());
		
		// procurando a posição de um elemento
		System.out.println("Posição do Bob: "+ lista.indexOf("Bob"));
		System.out.println("Procurando a posição de um elemento que não existe: "+ lista.indexOf("Pedro"));
		System.out.println("Posição do number 2: " + numeros.indexOf(2));
		

		// Percorrendo a lista com o for each
		for(String nomes: lista) {
			System.out.println(nomes);
		}
		
		System.out.println("-------------------");
		
		// filtrando elementos com base em um predicado
		List<String> novaLista = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String nome: novaLista) {
			System.out.println(nome);
		}
		
		System.out.println("--------------------");
		
		// Encontrando a primeira o ocorrência com base em um predicado
		
		String primeiraOcorrencia = lista.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		
		System.out.println(primeiraOcorrencia);
		
	}

}
