package util;

public class CurrencyConverter {
	public static final int IOF = 6;
	public static double valorFinal(double cotacaoDolar, double valorDolar) {
		double valorSemIof = cotacaoDolar * valorDolar;
		return valorSemIof  + (valorSemIof * IOF / 100);
	}
	
}
