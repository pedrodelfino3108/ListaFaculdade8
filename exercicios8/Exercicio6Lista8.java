package exercicios8;

import java.util.Scanner;

public class Exercicio6Lista8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o vlaor da base (B)");
		double base = sc.nextDouble();

		System.out.println("Digite o valor do expoente(E)");
		int expoente = sc.nextInt();

		double resultado = 1;

		for (int i = 1; i <= expoente; i++) {
			resultado *= base;
		}
		System.out.println("O resultado de " + base + "elevado a " + expoente + " é igual a " + resultado);

		sc.close();
	}
}
