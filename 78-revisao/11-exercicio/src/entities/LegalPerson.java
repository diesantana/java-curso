package entities;

public class LegalPerson extends TaxPayer {

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
	public Double taxCalculation() {
		if(numberEmployees >  10) {
			return getAnnualIncome() * 0.14;
		}
		else {
			return getAnnualIncome() * 0.16;
		}
	}

}
