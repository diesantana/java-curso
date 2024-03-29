package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxSercice;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxSercice = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		// calc basicPayment
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		double basicPayment = 0.0;
		
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		// cal tax 
		double tax = taxSercice.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}	
}
