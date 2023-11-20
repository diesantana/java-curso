import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//int y = 27;
		//double x = 10.35784;
		//double x1 = 9.7587;
		
		//System.out.print("Olá Mundo!");
		//System.out.println("Bom dia!");
		//System.out.println(y);
		//System.out.println(x);
		//System.out.printf("%.2f%n", x);
		//System.out.printf("%.4f%n", x);
		//System.out.println("O Resultado é: " + y + " Fim");
		
		//System.out.printf("O valor é %.2f%n", x); // O valor é 10,36
		//System.out.printf("O primeiro valor é: %.2f e o segundo valor é %.2f%n", x, x1);
		//O primeiro valor é: 10,36 e o segundo valor é 9,76
		//System.out.printf("A primeira nota foi %.2f %njá a segunda foi %.2f", x, x1);
		
		//String nome = "Maria";
		//int idade = 25;
		//double renda = 4000.0;
		
		//System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f%n", product1, price1);
		System.out.printf("%s, which price is $%.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		//Record: 30 years old, code 5290 and gender: F
		//Measue with eight decimal places: 53,23456700
		//Rouded (three decimal places): 53,235
		//US decimal point: 53.235

	}

}
