package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
		Scanner sc = new Scanner(System.in);
		File sourcePath = new File("c:\\temp\\in.csv");
		List<Product> products = new ArrayList<Product>();
		
		// ler o arquivo e add os produtos na lista products
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] filds = line.split(",");
				String name = filds[0];
				double price = Double.parseDouble(filds[1]);
				int quantity  = Integer.parseInt(filds[2]);
				products.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim da leitura...");
		
		// cria a pasta de saída
		String outPath = sourcePath.getParent() + "\\out";
		boolean createFolder = new File(outPath).mkdir();
		
		// escreve um novo arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outPath + "\\summary.csv"))) 
		{
			for (Product product : products) {
				bw.write(product.toString());
				bw.newLine();
			}
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Programa finalizado!");
		sc.close();
	}

}
