package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer quantityMonths) {
		// months é a quantidade de parcelas
		LocalDate dateContract = contract.getDate();
		
		for (int i = 1; i <= quantityMonths; i++) {
			// data da parcela atual
			LocalDate dueDate = dateContract.plusMonths(i);
			
			// valor da parcela sem juros
			Double valueFree = contract.getTotalValue() / quantityMonths;
			// valor do juros no mês
			Double valueInterest = paymentService.interest(valueFree, i);
			// valor da taxa de pagamento da parcela
			Double feeAmount = paymentService.paymentFee(valueFree + valueInterest);
			// valor final (juros + taxa)
			Double finalValue = valueFree + valueInterest + feeAmount;
			
			contract.addInstallment(new Installment(dueDate, finalValue));
		}
	}
}
