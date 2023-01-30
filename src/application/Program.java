package application;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma nota:");
		double nota = input.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida");
		} else if (nota >= 8.1) {
			System.out.println("Conceito A");
			System.out.println("Parabéns!!!");
		} else if (nota >= 6.1) {
			System.out.println("Conceito B");
		} else if (nota >= 4.1) {
			System.out.println("Conceito C");
		} else if (nota >= 2.1) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito E");
		}
		System.out.println("Fim");
		input.close();
	}

}
