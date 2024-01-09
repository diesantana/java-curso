package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> produtos = new ArrayList<>();

		File sourceFile = new File("C:\\temp\\produtos.csv");
		
		try(Scanner sc = new Scanner(sourceFile)){
			
			while(sc.hasNextLine()) {
				String[] productArray = sc.nextLine().split(",");
				
				// variáveis aux
				String name = productArray[0];
				double price = Double.parseDouble(productArray[1]);
				int quantity = Integer.parseInt(productArray[2]);
				
				produtos.add(new Product(name, price, quantity));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		// Cria a pasta de saída
		boolean outputCreate = new File(sourceFile.getParent() + "\\out").mkdir();
		
		// Obtem o path de pasta de saida
		String outputDirPath = sourceFile.getParent() + "\\out";
		
		// criando um novo arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputDirPath + "\\summary.csv"))){
			
			for(Product p: produtos) {
				bw.write(p.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FIM DO PROGRAMA!");
	}

}
