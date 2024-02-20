package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		double real = amount * dollarPrice;
		real += real * IOF;
		return real;
	}
}
