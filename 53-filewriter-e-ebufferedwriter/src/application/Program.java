package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		// try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt"))){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\temp\\out.txt", true))){
			
			for(String line : lines) {
				bw.write(line); // write the element of vector on the line
				bw.newLine();  // create new line
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
