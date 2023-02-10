package application;

import java.util.Scanner;

import entities.Nota;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma nota:");
		double nota = sc.nextDouble();

		Nota n = new Nota(nota);

		try {
			System.out.println(n.operacao());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim");
		sc.close();
	}

}
