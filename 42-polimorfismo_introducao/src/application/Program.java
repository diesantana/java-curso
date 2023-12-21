package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account x = new Account(1001, "Maria", 1000.00);
		Account y = new SavingsAccount(1002, "Bob", 1000.00, 0.01);
		
		x.withDraw(50.0);
		y.withDraw(50.0);

		System.out.println(x.getBalance()); // 945.0
		System.out.println(y.getBalance()); // 950.0
	}

}
