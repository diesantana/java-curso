package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> candidates = new LinkedHashMap<String, Integer>();
		
		System.out.print("Insira o caminho completo do arquivo: ");
		String path = sc.next();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			while(linha != null) {
				String[] filds = linha.split(",");
				String candidate =  filds[0];
				int votes = Integer.parseInt(filds[1]);
				
				if(candidates.containsKey(candidate)) {
					votes += candidates.get(candidate);
					candidates.put(candidate, votes);
				}else {
					candidates.put(candidate, votes);					
				}
				linha = br.readLine();
			} 
			
			for (String key : candidates.keySet()) {
				System.out.println(key +": " + candidates.get(key));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
