package entities;

public class SavingsAccount extends Account {
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * (interestRate / 100);
	}
	
	@Override
	public final void withDraw(Double amount) {
		if(amount > balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance -= amount;
		}
	}
	
	
}
