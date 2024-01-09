package application;

import java.io.File;

public class Program {

	public static void main(String[] args) {
		
		File path = new File("c:\\temp\\in.txt");
		
		String name = path.getName(); // in.txt
		String caminho = path.getPath(); // c:\temp\in.txt
		String caminhoAbsoluto = path.getAbsolutePath(); // c:\temp\in.txt
		String parent = path.getParent(); // c:\temp

		
		System.out.println(parent);
		 

	}

}
