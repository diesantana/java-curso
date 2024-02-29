package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.AccountException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account acc = new Account(number, holder, initialBalance, limit);
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f", acc.getBalance());
		} 
		catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		sc.close();
	}

}
