package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Set<Integer> students = new HashSet<Integer>();
		
		System.out.print("How many students for course A? ");
		int nStudents = sc.nextInt();
		
		for (int i = 0; i < nStudents; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
		
		System.out.print("How many students for course B? ");
		nStudents = sc.nextInt();
		
		for (int i = 0; i < nStudents; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
		
		System.out.print("How many students for course C? ");
		nStudents = sc.nextInt();
		
		for (int i = 0; i < nStudents; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
		
		System.out.println("Total students: " + students.size());
		sc.close();
	}

}
