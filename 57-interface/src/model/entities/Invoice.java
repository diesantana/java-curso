package model.entities;

public class Invoice {
	public Double basicPayment;
	public Double tax;
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("FATURA:\n");
		sb.append(String.format("Pagamento basico: %.2f\n", getBasicPayment()));
		sb.append(String.format("Imposto: %.2f\n", getTax()));
		sb.append(String.format("Pagamento total: %.2f\n", getTotalPayment()));
		
		return sb.toString();
	}
	
}
