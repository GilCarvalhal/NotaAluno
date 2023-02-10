package entities;

public class Nota {

	private double notas;

	public Nota() {
	}

	public Nota(double notas) {
		this.notas = notas;
	}

	public double getNotas() {
		return notas;
	}

	public String operacao() {
		if (notas >= 8.1 && notas <= 10) {
			return "Conceito A";
		} else if (notas < 8.1 && notas >= 6.1) {
			return "Conceito B";
		} else if (notas < 6.1 && notas >= 4.1) {
			return "Conceito C";
		} else if (notas < 4.1 && notas >= 2.1) {
			return "Conceito D";
		} else if (notas < 2.1 && notas >= 0) {
			return "Conceito E";
		} else {
			throw new RuntimeException("Invalid command: Unexpected error");
		}
	}

}
