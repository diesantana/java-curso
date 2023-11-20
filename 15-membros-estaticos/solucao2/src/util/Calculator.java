package util;

public class Calculator {
	public double raio;
	public final double PI = 3.14159;
	
	public double circunferencia() {
		return 2.00 * PI * raio;
	}
	
	public double volume() {
		return 4.00 * PI * Math.pow(raio, 3) / 3;
	}
}
