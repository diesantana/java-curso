package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int mRows = sc.nextInt();
		int nColumn = sc.nextInt();
		
		int[][] matriz = new int[mRows][nColumn];
		
		// percorre as linhas
		for (int i = 0; i < matriz.length; i++) {  
			
			// percorre as colunas
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Matriz povoada, entre com um valor para a pesquisa: ");
		int search = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] == search) {
					System.out.println("Position: " + i + ", " + j + ":");
					// left
					// se estiver na coluna 0, não tem left
					if(j > 0) {
						System.out.println("Left: " + matriz[i][(j - 1)]);
					}
					
					// right
					// se j >= matriz.length -1 não tem right
					if(j < (matriz.length - 1)) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					
					// up
					// para ter up o i (rowns) deve ser > 0
					if(i > 0) {
						System.out.println("Up: " + matriz[i -1][j]);
					}
					
					// down
					// para ter down a matriz[0].length () deve ser menor i-1
					if(i < (matriz.length - 1)) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
