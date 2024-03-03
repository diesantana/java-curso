package model.services;

public interface OnlinePaymentService {
	// taxa de pagamento
	Double paymentFee(Double amount);
	// juros mensal
	Double interest(Double amount, Integer months);
}
