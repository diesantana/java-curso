package application;

import java.io.File;

public class Program {

	public static void main(String[] args) {
	
		File path = new File("c:\\temp");
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS");
		
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES: ");
		
		for(File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		boolean success = new File("c:\\temp" + "\\nova pasta").mkdir();
		System.out.println("Directory created successfully: " + success);
		

	}

}
