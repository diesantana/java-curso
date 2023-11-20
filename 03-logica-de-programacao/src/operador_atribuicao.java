import java.util.Locale;
import java.util.Scanner;

public class operador_atribuicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// 50 reais da direito a 100 minutos
		// cada minuto que exceder os 100, custa 2 reais
		Scanner leitura = new Scanner(System.in);
		int minutos = leitura.nextInt();
		double precoFranquia = 50.0;
		if(minutos > 100) {
			precoFranquia += (double)(minutos - 100)* 2.00;
		}
		System.out.printf("Valor a pagar: R$ %.2f%n", precoFranquia);
		leitura.close();
	}

}
