package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rental {
	private String model;
	private LocalDateTime pickupData;
	private LocalDateTime returnData;
	private Double valuePerHour;
	private Double valuePerDay;
	
	
	public Rental() {
	}
	
	public Rental(String model, LocalDateTime pickupData, LocalDateTime returnData, Double valuePerHour,
			Double valuePerDay) {
		this.model = model;
		this.pickupData = pickupData;
		this.returnData = returnData;
		this.valuePerHour = valuePerHour;
		this.valuePerDay = valuePerDay;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalDateTime getPickupData() {
		return pickupData;
	}

	public void setPickupData(LocalDateTime pickupData) {
		this.pickupData = pickupData;
	}

	public LocalDateTime getReturnData() {
		return returnData;
	}

	public void setReturnData(LocalDateTime returnData) {
		this.returnData = returnData;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Double getValuePerDay() {
		return valuePerDay;
	}

	public void setValuePerDay(Double valuePerDay) {
		this.valuePerDay = valuePerDay;
	}
	
	public Integer Duration() {
		Duration duration = Duration.between(pickupData, returnData);
		int durationHours = (int) Math.ceil((double) duration.toMinutes() / 60.0); 
		return durationHours;
	}
	
	public Double basicPayment() {
		double hours = (double) Duration();
		if(Duration() < 12) {
			return hours * valuePerHour;			
		}else {
			return hours * valuePerDay;
		}
	}
	
	public Double tax() {
		if(basicPayment() <= 100.00) {
			return basicPayment() * 0.2;
		}	
		return basicPayment() * 0.15;			
	}
	
	public Double totalPayment() {
		return basicPayment() + tax();
	}
	
	public static DateTimeFormatter getDateFormat() {
		return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("FATURA:\n");
		sb.append(String.format("Pagamento basico: %.2f\n", basicPayment()));
		sb.append(String.format("Imposto: %.2f\n", tax()));
		sb.append(String.format("Pagamento total: %.2f\n", totalPayment()));
		
		
		return sb.toString();
	}
	
	
	
}
