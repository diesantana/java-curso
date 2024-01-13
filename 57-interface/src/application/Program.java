package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com os dados do aluguel: ");
		
		System.out.print("Modelo do carro: ");
		Vehicle vehicle = new Vehicle(scanner.nextLine());
		
		System.out.print("Retirada: ");
		String start = scanner.nextLine();
		LocalDateTime startDate = LocalDateTime.parse(start, getDateFormat());
		
		System.out.print("Retorno: ");
		String finish = scanner.nextLine();
		LocalDateTime finishDate = LocalDateTime.parse(finish, getDateFormat());
		
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = scanner.nextDouble();
		
		System.out.print("Entre com o preço por dia: ");
		Double pricePerDay = scanner.nextDouble();
		
		CarRental rental = new CarRental(startDate, finishDate, vehicle);
		
		// service para gerar a fatura
		RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		// gerando a fatura a partir do service "rentalService" instanciado acima
		service.processInvoice(rental);
		
		System.out.println(rental.getInvoice());

		scanner.close();
	}
	

	public static DateTimeFormatter getDateFormat() {
		return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	}

}
