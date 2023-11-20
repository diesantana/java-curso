import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner lerDados = new Scanner(System.in);
		
		// while
		/*
		char resposta = 's';
		while(resposta == 's') {
			System.out.print("Digite a temperatura em Celsius:");
			double celsius = lerDados.nextDouble();
			double f = 9.0 * celsius / 5.0 + 32.0; 
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = lerDados.next().charAt(0);
		}
		*/
		
		// do while
		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius:");
			double celsius = lerDados.nextDouble();
			double f = 9.0 * celsius / 5.0 + 32.0; 
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = lerDados.next().charAt(0);
		}while (resposta == 's');
		lerDados.close();
		
		
	}

}
