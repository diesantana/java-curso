import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lerDados = new Scanner(System.in);
		
		int n = lerDados.nextInt();
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			int x = lerDados.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		lerDados.close();
	}

}
