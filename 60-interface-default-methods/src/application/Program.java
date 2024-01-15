package application;

import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.Scanner;

import model.service.InterestService;
import model.service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Quantia: ");
			double quantity = sc.nextDouble();
			System.out.print("Meses: ");
			int months = sc.nextInt();
			
			//InterestService is = new BrazilInterestService(2.0);
			InterestService is = new UsaInterestService(1.0);
			double payment = is.payment(quantity, months);
			System.out.println("Pagamento após " + months + " meses:");
			System.out.printf("%.2f", payment);
		} catch (InvalidAlgorithmParameterException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
