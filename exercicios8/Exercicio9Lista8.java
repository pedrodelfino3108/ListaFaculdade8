package exercicios8;

import java.util.Scanner;

public class Exercicio9Lista8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 valores numéricos");

		int soma = 0;
		double media;
		final int valores_totais = 10;
		for (int i = 1; i <= valores_totais; i++) {
			System.out.print("Valor " + i + ": ");
			int valor = sc.nextInt();
			soma += valor;
		}

		media = (double) soma / valores_totais;

		System.out.println("Total do somatório: " + soma);
		System.out.println("Média aritmética: " + media);

		sc.close();
	}
}
