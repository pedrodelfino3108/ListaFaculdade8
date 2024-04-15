package exercicios8;

public class Exercicio10Lista8 {
	public static void main(String[] args) {
		int inicio = 50;
		int fim = 70;
		int soma = 0;
		int quantidade = 0;

		System.out.println("Valores pares na faixa numérica de " + inicio + " a " + fim + ":");

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				soma += i;
				quantidade++;
			}
		}

		double media = (double) soma / quantidade;

		System.out.println("Soma dos valores pares: " + soma);
		System.out.println("Média aritmética dos valores pares: " + media);
	}
}
