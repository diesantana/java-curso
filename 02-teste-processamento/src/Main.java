import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*int y, x;
		x = 5;
		y = 2 * x;
		System.out.println(x); // 5
		System.out.println(y); // 10*/
		
		/*int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x); // 5
		System.out.println(y); // 10.0 */
		
		/*
		// Calculando a area de um trapezio 
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.println(area); // 35.0
		*/
		
		/*
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		System.out.println(resultado); // 2.5
		*/
		/*
		double a;
		int b;
		
		a = 5.0;
		b = (int) a;
		System.out.println(b); // 5
		sysout
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		*/
		/*
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		*/
		/*
		Locale.setDefault(Locale.US);
		Scanner leituraDados = new Scanner(System.in);
		double x;
		x = leituraDados.nextDouble();
		System.out.println("Você digitou: " + x);
		
		leituraDados.close();
		*/
		/*
		Scanner leituraDados = new Scanner(System.in);
		double x;
		x = leituraDados.nextDouble();
		System.out.printf("Você digitou %.1f%n", x);
		
		leituraDados.close();
		*/
		/*
		Scanner leituraDados = new Scanner(System.in);
		char x;
		x = leituraDados.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		leituraDados.close();
		*/
		/*
		Scanner leituraDados = new Scanner(System.in);
		String x;
		int y;
		double z;
		
		x = leituraDados.next();
		y = leituraDados.nextInt();
		z = leituraDados.nextDouble();
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		leituraDados.close();
		*/
		/*
		Scanner leituraDados = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = leituraDados.nextLine();
		s2 = leituraDados.nextLine();
		s3 = leituraDados.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		leituraDados.close();
		*/
		
		Scanner leitura = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = leitura.nextInt();
		leitura.nextLine();
		s1 = leitura.nextLine();
		s2 = leitura.nextLine();
		s3 = leitura.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		leitura.close();
	}

}
