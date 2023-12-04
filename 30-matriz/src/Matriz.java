import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// declaração
		//int[][] a = new int[3][3];
		
		// inicialização 
		int[][] b = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		// acessando um elemento
		int elemento = b[1][1];
		System.out.println(elemento); // 5
		
		// modificando o valor de um elemento
		b[1][1] = 13;
		
		int elementoNovoValor = b[1][1];
		System.out.println(elementoNovoValor); // 13
 		
		// tamanho da mariz (length)
		int linhas = b.length;
		System.out.println("Linhas: "+ linhas); // Linhas: 3
		
		int colunas = b[0].length;
		System.out.println("Colunas: "+ colunas); // Colunas: 3
		
		// iterando sobre uma matriz 
		System.out.println();
		System.out.println("Iteraçaõ em uma Matriz:");
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j <b[0].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Matriz Irregular ou Jagged Arrays
		System.out.println("Jagged Arrays");
		int[][] jagged = {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9}
		};
		
		// Isso resultara em uma exceção
		System.out.println(jagged[1][2]);
		
		

		sc.close();
	}

}
