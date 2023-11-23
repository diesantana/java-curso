package entities;

public class Conta {
	private int numberConta;
	private String nameConta;
	private double saldoConta;
	public static final double TAXA_SAQUE = 5.00;
	
	public Conta(int numberConta, String nameConta, double depositoInicial) {
		this.numberConta = numberConta;
		this.nameConta = nameConta;
		deposito(depositoInicial);
	} 
	
	public Conta(int numberConta, String nameConta) {
		this.numberConta = numberConta;
		this.nameConta = nameConta;
	}

	public String getNameConta() {
		return nameConta;
	}

	public void setNameConta(String nameConta) {
		this.nameConta = nameConta;
	}

	public int getNumberConta() {
		return numberConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	} 

	public void deposito(double valorDeposito) {
		this.saldoConta += valorDeposito;	
	}
	
	public void saques(double valorSaque) {
		this.saldoConta -= (valorSaque + TAXA_SAQUE);
	}

	public String toString() {
		return String.format("Conta %d, Titular: %s, Saldo: $ %.2f", numberConta, nameConta, saldoConta);
	}
	
	
	
	
	

}
