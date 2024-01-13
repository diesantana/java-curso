package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		int tax = 1 * months;
		Double percentTax = (double) tax / 100.0;
		return amount * percentTax;
	}

}
