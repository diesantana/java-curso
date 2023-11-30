package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numeros2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int numero : numeros) {
			System.out.println("5 x "+numero+" = "+ numero * 5);
		}
		
		System.out.println(numeros2[5]);
	}

}
