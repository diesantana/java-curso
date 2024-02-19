package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 60.0;
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Notes:");
		double note1 = sc.nextDouble();
		double note2 = sc.nextDouble();
		double note3 = sc.nextDouble();
		Student student = new Student(name, note1, note2, note3);
		
		System.out.println();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalScore());
		if(student.finalScore() < media) {
			System.out.println("FAILED");
			double missing = media - student.finalScore();
			System.out.printf("MISSING: %.2f POINTS", missing);
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
