package applicarion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidates = new LinkedHashMap<String, Integer>();
		
		System.out.print("Enter file full path: ");
		File path = new File(sc.nextLine());
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String[] filds = line.split(",");
				String name = filds[0];
				int votes = Integer.parseInt(filds[1]);
				
				// vertifica se já existe 
				if (candidates.containsKey(name)) {
					votes += candidates.get(name);
					candidates.put(name, votes);
				} else {
					candidates.put(name, votes);
				}
				
				line = br.readLine();
			}
			
			// Ordenando pela quantidade de votos
			
			
			// iterando sobre os elementos do Map
			Set<String> keys = candidates.keySet();
			for (String string : keys) {
				System.out.println(string + ": " + candidates.get(string));
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
