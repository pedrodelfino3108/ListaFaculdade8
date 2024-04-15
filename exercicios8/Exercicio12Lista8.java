package exercicios8;

import java.util.Scanner;

public class Exercicio12Lista8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite valores inteiros positivos (digite um valor negativo para encerrar):");

		while (true) {
			System.out.print("Digite um valor: ");
			int valor = sc.nextInt();

			if (valor < 0) {
				break;
			}

			if (valor > maior) {
				maior = valor;
			}

			if (valor < menor) {
				menor = valor;
			}
		}

		if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
			System.out.println("Nenhum valor positivo foi informado.");
		} else {
			System.out.println("Maior valor informado: " + maior);
			System.out.println("Menor valor informado: " + menor);
		}

		sc.close();
	}
}
