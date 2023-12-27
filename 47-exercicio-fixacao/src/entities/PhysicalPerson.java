package entities;

public class PhysicalPerson extends Taxpayer {
	private Double healthExpenditures;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double calcTax() {
		double tax = 0.0;
		
		if(this.getAnnualIncome() < 20000.00) {
			tax = this.getAnnualIncome() * TAX_RATE_15_PERCENT;
		} 
		else{
			tax = getAnnualIncome() * TAX_RATE_25_PERCENT;
		}
		
		if(healthExpenditures > 0.0) {
			tax = tax - (healthExpenditures / 2.0);
			return tax;
		}else {
			return tax;			
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s: $ %.2f", this.name, this.calcTax());
	}

}
