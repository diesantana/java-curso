import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		int senhaAtual = 2002;
		int senha = lerDados.nextInt();
		
		while(senha != senhaAtual) {
			System.out.println("Senha Invalida");
			
			senha = lerDados.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		lerDados.close();
		
	}

}
