package entities;

public class Account {
	private int number;
	private String name;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account: " + number);
		sb.append(", Holder: " + name);
		sb.append(", Balance: $ "+ String.format("%.2f", balance));
		return sb.toString();
	}
	
	
	
	
	
}
