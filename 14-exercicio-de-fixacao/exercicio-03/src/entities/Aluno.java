package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		if(notaFinal() >= 60.00) {
			return String.format("FINAL GRADE: %.2f%nPASS", notaFinal());
		}
		else {
			return String.format("FAILED%nMISSING %.2f POINTS", (60.00-notaFinal()));
		}
	}
}
