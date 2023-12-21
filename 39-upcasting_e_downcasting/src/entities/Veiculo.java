package entities;

public class Veiculo {
	private String cor; 
	private Integer rodas;
	
	public Veiculo() {
	}
	
	public Veiculo(String cor, Integer rodas) {
		super();
		this.cor = cor;
		this.rodas = rodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getRodas() {
		return rodas;
	}

	public void setRodas(Integer rodas) {
		this.rodas = rodas;
	}

	public void mover() {
		System.out.println("Veículo em movimento");
	}
}
