package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\novo-arquivo.txt", true))) 
		{
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Finalizando a escrita...");
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
