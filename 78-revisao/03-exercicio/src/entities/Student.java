package entities;

public class Student {
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Student(String name, double nota1, double nota2, double nota3) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double finalScore() {
		return nota1 + nota2 + nota3;
	}
}
