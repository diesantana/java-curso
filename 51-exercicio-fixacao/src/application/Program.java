package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		boolean validEntry = false;
		
		while (!validEntry) {
			try {
				System.out.println("Enter account data:");
				System.out.print("Number: ");
				int number = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Holder: ");
				String holder = scanner.nextLine();
				System.out.print("Initial balance: ");
				double balance = scanner.nextDouble();
				System.out.print("Withdraw limit: ");
				double limit = scanner.nextDouble();
				Account account = new Account(number, holder, balance, limit);
				System.out.println();
				System.out.print("Enter amount for widthdraw: ");
				double amountWithdraw = scanner.nextDouble();
				account.withdraw(amountWithdraw);
				System.out.printf("New balance: %.2f", account.getBalance());
				validEntry = true;
			} catch (DomainException e) {
				System.out.println(e.getMessage());
				System.out.println();
			} 
		}
		scanner.close();			
	}

}
