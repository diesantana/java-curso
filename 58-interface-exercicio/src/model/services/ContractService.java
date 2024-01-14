package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService service;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.service = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		int iMonth = 1;
		for(int i = 1; i <= months; i++) {
			Double installmentValue = contract.getTotalValue() / months; // Valor da parcela sem juros 
			Double interestMonth = service.interest(installmentValue, i); // Juros de acordo com a parcela atual
			Double valueWithInterest = interestMonth + installmentValue; // Valor da parcela com o jutos mensal 

			Double paymentRate = service.paymentFee(valueWithInterest); // taxa de pagamento 
			Double valorFimMes = paymentRate + valueWithInterest; // valor final, com juros mensal e taxa 

			// Adicionando as parcelas no contrato
			contract.getInstallments().add(new Installment(contract.getDate().plusMonths(iMonth), valorFimMes));
			iMonth ++;
		}

	}
}
