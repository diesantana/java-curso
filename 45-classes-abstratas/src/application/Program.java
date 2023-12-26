package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// Não é possível instanciar o tipo Account, agora que é uma classe abstract 
		// Account ac1 = new Account(1001, "Joao", 500.00);
		Account ac2 = new BusinessAccount(1002, "Bob", 500.0, 1000.0);
		Account ac3 = new SavingsAccount(1003, "Maria", 500.0, 1.0);
		
		// Demo: suponha que você queira:
		// 	• Totalizar o saldo de todas as contas.
		// 	• Depositar 10.00 em todas as contas
		
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(ac2);
		accounts.add(ac3);
		double sum = 0;
		
		for(Account acc: accounts) {
			acc.deposit(10.0);
			sum += acc.getBalance();
		}
		
		System.out.println(sum);

	}

}
