package application;

import entities.Carro;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("azul", 2);
		veiculo.mover(); // Veículo em movimento
		
		Carro meuCarro = new Carro("preto", 4, 4);
		meuCarro.mover();
		meuCarro.abrirPortas();
		
		// upcasting
		Veiculo meuCarro2 = new Carro("preto", 4, 4);
		meuCarro2.mover();
		// meuCarro2.abrirPortas();
		
		//downcasting 
		if(veiculo instanceof Carro) {
			Carro veiculo2 = (Carro) veiculo;
			veiculo2.abrirPortas();			
		}
		else {
			System.out.println("Você não pode fazer o casting");
		}

	}

}
