package exercicios8;

import java.util.Scanner;

public class Exercicio1Lista8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		System.out.println("Tabuada de multiplicação do número " + numero + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + "=" + (numero * i));
		}
		sc.close();
	}
}
