package model.service;

public class BrazilInterestService implements InterestService {
	private double InterestRate;

	public BrazilInterestService(double interestRate) {
		InterestRate = interestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return InterestRate;
	}
	
}
