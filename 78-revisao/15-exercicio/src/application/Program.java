package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Set<LogEntry> logs = new HashSet<LogEntry>();
		
		System.out.print("Enter file path: ");
		File path = new File(sc.nextLine());
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				String[] filds = line.split(" ");
				String username = filds[0];
				Instant momemnt = Instant.parse(filds[1]);
				logs.add(new LogEntry(username, momemnt));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + logs.size());
					
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}

}
