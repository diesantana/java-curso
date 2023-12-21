package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {}
	
	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw(Double amount) {
		if(amount < balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance -= amount;
		}
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
}
