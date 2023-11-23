package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int numberConta;
		String titularConta;
		char isDeposit;
		double retirada;
		double deposito;
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		numberConta = scanner.nextInt();
		
		// Consome a quebre de linha deixada pelo nextInt()
		scanner.nextLine();
		
		System.out.print("Insira o titular da conta: ");
		titularConta = scanner.nextLine();
		
		
		System.out.print("Existe um depósito inicial (y/n)? ");
		isDeposit = scanner.next().charAt(0);
		
		if(isDeposit == 'y') {
			System.out.print("Insira o valor do depósito inicial: ");
			deposito = scanner.nextDouble();
			conta = new Conta(numberConta, titularConta, deposito);
		}else {
			conta = new Conta(numberConta, titularConta);
		}
		
		
		
		System.out.println();
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Insira um valor de depósito: ");
		deposito = scanner.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Insira um valor de retirada: ");
		retirada = scanner.nextDouble();
		conta.saques(retirada);

		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);

		scanner.close();
	}

}
