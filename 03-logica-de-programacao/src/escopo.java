
public class escopo {

	public static void main(String[] args) {
		double preco = 22.0;
		double desconto = 0;
		
		if(preco > 20.0) {
			desconto = preco * 0.1;
		}
		System.out.println(desconto); // 2.2

	}

}
