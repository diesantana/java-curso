package entities;

public class Conta {
	private int numberConta;
	private String nameConta;
	private double depositoInicial;
	private double saldoConta;
	public static final double TAXA = 5.00;
	
	public Conta(int numberConta, String nameConta, double depositoInicial) {
		this.numberConta = numberConta;
		this.nameConta = nameConta;
		this.depositoInicial = depositoInicial;
		this.saldoConta = this.depositoInicial;
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

	public double getDepositoInicial() {
		return depositoInicial;
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
		this.saldoConta -= (valorSaque + TAXA);
	}

	public String toString() {
		return String.format("Conta %d, Titular: %s, Saldo: $ %.2f", numberConta, nameConta, saldoConta);
	}
	
	
	
	
	

}
