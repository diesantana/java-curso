package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		// boxing
		Object obj = x;
		
		// unboxing
		int y = (int) obj;
		
		System.out.println(x);
		System.out.println(obj);
		System.out.println(y);

	}

}
