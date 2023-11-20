import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		/* 
		 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		X, se for o caso. 
		*/
		Scanner lerDados = new Scanner(System.in);
		int x = lerDados.nextInt();
		if(x >= 1 && x < 1000) {
			for(int i = 0; i <= x; i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Número inválido!");
		}
		
		lerDados.close();
	}

}
