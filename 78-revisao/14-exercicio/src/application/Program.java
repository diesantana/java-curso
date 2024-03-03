package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		String dateStr = sc.nextLine();
		LocalDate date = LocalDate.parse(dateStr, fmt);
		System.out.print("Valor do contrato: ");
		double valueContract = sc.nextDouble();
		
		Contract contract = new Contract(number, date, valueContract);
		
		System.out.print("Entre com o numero de parcelas: ");
		int quantityInstallments = sc.nextInt();
		
		ContractService cService = new ContractService(new PaypalService());
		cService.processContract(contract, quantityInstallments);
		
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		sc.close();
	}
}
