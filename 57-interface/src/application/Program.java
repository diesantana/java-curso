package application;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Rental;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Rental r = new Rental(
				"Civic", 
				LocalDateTime.parse("25/06/2018 10:30", Rental.getDateFormat()), 
				LocalDateTime.parse("27/06/2018 11:40", Rental.getDateFormat()), 
				10.00, 
				130.00);
		
		System.out.println(r);
		scanner.close();
	}

}
