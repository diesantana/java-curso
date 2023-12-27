package entities;

public abstract class Taxpayer {
	protected String name;
	private Double annualIncome;
	
	// constantes para taxa de imposto
	protected static final double TAX_RATE_14_PERCENT = 0.14;
	protected static final double TAX_RATE_15_PERCENT = 0.15;
	protected static final double TAX_RATE_16_PERCENT = 0.16;
	protected static final double TAX_RATE_25_PERCENT = 0.25;

	
	public Taxpayer() {
	}

	public Taxpayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract Double calcTax();	
}
