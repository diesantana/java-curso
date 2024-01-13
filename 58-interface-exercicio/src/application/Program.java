package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		
		System.out.print("Numero: ");
		int number = scanner.nextInt();
	
		
		System.out.print("Data (dd/MM/yyyy): ");
		scanner.nextLine();
		LocalDate  date = LocalDate.parse(scanner.nextLine(), getDateFormatter());
		
		System.out.print("Valor do contrato: ");
		double value = scanner.nextDouble();
		
		// contrato 
		Contract c = new Contract(number, date, value);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberOfInstallments = scanner.nextInt();
		
		
		// Chamando o servico ContractService, passando um tipo de Serviço de pagamento online
		// No nosso programa o tipo de pagamento online é o Paypal 
		ContractService service = new ContractService(new PaypalService());
		
		// chamando o método que vai procesar o contrato, passando o contrato e a qtd de parcelas
		service.processContract(c, numberOfInstallments);
		
		System.out.println(c);
		

		scanner.close();

	}
	
	public static DateTimeFormatter getDateFormatter() {
		return DateTimeFormatter.ofPattern("dd/MM/yyyy");
	}

}
