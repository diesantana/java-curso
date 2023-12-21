package entities;

public class OutSourcedEmployee extends Employee {
	private Double addtionalCharge;

	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public final Double payment() {
		Double value = super.payment() + (addtionalCharge + addtionalCharge / 100 * 10);
		return value;
	}
	
	
	
	
}
