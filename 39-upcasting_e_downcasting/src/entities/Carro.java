package entities;

public class Carro extends Veiculo{
	private Integer portas;

	public Carro() {
		super();
	}

	public Carro(String cor, Integer rodas, Integer portas) {
		super(cor, rodas);
		this.portas = portas;
	}

	public Integer getPortas() {
		return portas;
	}

	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	
	public void abrirPortas() {
		System.out.println("Abrindo a porta");
	}
}
