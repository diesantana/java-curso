package application;

import entities.Account;
import entities.BusinessAccount;

public class Teste {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "John", 100.00, 500.0);
		acc1.getBalance();
		
		// Downcasting
		
		if(acc instanceof BusinessAccount) {
			BusinessAccount acc3 = (BusinessAccount)new Account(1004, "Bob", 0.0);
			System.out.println("acc é uma instância de BusinessAccount");
		}else {
			System.out.println("acc não é uma instância de BusinessAccount!\nDowncasting não é seguro!");
		}
		
		if(acc2 instanceof BusinessAccount) {
			BusinessAccount acc4 = (BusinessAccount) acc2;
			System.out.println("acc2 é uma instância de BusinessAccount");
		}else {
			System.out.println("acc2 não é uma instância de BusinessAccount!");
		}
		
		
		
	}

}
