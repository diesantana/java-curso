package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainException {
		if(balance < 0 || withdrawLimit < 0) {
			throw new DomainException("Error: Balance and withdraw limit cannot be negative numbers!");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) throws DomainException {
		if(amount <= 0) {
			throw new DomainException("Deposit error: The amount must be greater than zero");
		}
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("WithDraw error: The amount exceeds withdrawl limit");
		} else if(amount > balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		balance -= amount;
	}
}
