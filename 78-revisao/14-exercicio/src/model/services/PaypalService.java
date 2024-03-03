package model.services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(Double amount) {
		// amount = valor da parcela com os juros
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		// months é um int que representa qual mes da parcela se trata
		return amount * (0.01 * months);
	}

}
