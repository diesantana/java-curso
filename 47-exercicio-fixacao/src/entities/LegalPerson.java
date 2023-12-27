package entities;

public class LegalPerson extends Taxpayer {
	private Integer numberEmployees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double calcTax() {
		double tax = 0;
		if(numberEmployees > 10) {
			tax = getAnnualIncome() * TAX_RATE_14_PERCENT;
		}else {
			tax = getAnnualIncome() * TAX_RATE_16_PERCENT;
		}
		
		return tax;
	}
	
	@Override
	public String toString() {
		return String.format("%s $ %.2f", name, calcTax());
	}

}
