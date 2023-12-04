package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		Integer[][] numbers = new Integer[M][N];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = scanner.nextInt();
			}
		}
		
		int occurrence = scanner.nextInt();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				if(numbers[i][j] == occurrence) {
					System.out.println("Position " +i+","+j+":");
					if(j - 1  >= 0) {
						System.out.println("Left: " + numbers[i][(j -1)]);
					}
					if(i - 1 >= 0){
						System.out.println("Up: " + numbers[i-1][j]);
					}
					if(j + 1 < numbers[0].length) {
						System.out.println("Right: " + numbers[i][(j +1)]);
					}
					if(i+1 < numbers.length) {
						System.out.println("Down: " + numbers[i+1][j]);
					}


				}
			}
		}
		
		
		
		scanner.close();
	}

}
