package entities;

public class PhysicalPerson extends TaxPayer{
	private Double healthSpending;

	public PhysicalPerson() {
		super();
	}
	
	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}
	
	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public Double taxCalculation() {
		double tax = 0.0;
		
		if(getAnnualIncome() < 20000) {
			tax = getAnnualIncome() * 0.15;
		}else {
			tax = getAnnualIncome() * 0.25;
		}
		
		if(healthSpending > 0) {
			tax -= healthSpending * 0.5;
		}
		
		return tax;
	}

	
}
