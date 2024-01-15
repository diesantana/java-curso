package model.service;

import java.security.InvalidAlgorithmParameterException;

public interface InterestService {
	double getInterestRate();
	
	default double payment(double amount, int months) throws InvalidAlgorithmParameterException {
		if(months < 1 ) {
			throw new InvalidAlgorithmParameterException("Meses não pode ser menor que 1");
		}
		double payment = amount * Math.pow(1 + getInterestRate() / 100.0, months);
		return payment;
	}
}
