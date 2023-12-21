package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account conta1 = new Account(10, "Maria", 1000.0);
		conta1.withDraw(200.00);
		System.out.println(conta1.getBalance()); // 795
		
		SavingsAccount contaPoupanca = new SavingsAccount(11, "Bob", 1000.00, 1.0);
		contaPoupanca.withDraw(200.00);
		System.out.println(contaPoupanca.getBalance()); // 800
		
		BusinessAccount contaEmpresa = new BusinessAccount(12, "John", 1000.0, 500.0);
		contaEmpresa.withDraw(200.0);
		System.out.println(contaEmpresa.getBalance()); // 793
	}

}
