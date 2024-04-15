package exercicios8;

import java.util.Scanner;

public class Exercicio11Lista8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double area_total = 0;

		System.out.println("Calculadora de Área Residencial");

		while (true) {
			System.out.print("\nDigite o nome do cômodo: ");
			String nome = sc.next();

			System.out.print("Digite a largura do cômodo em metros: ");
			double largura = sc.nextDouble();

			System.out.print("Digite o comprimento do cômodo em metros: ");
			double comprimento = sc.nextDouble();

			double comodo = largura * comprimento;
			area_total += comodo;

			System.out.println("Área do cômodo '" + nome + "': " + comodo + " metros quadrados");

			System.out.print("Deseja calcular a área de outro cômodo? (Sim/Não): ");
			String continuar = sc.next();

			if (!continuar.equalsIgnoreCase("Sim")) {
				break;
			}
		}

		System.out.println("Área total da residência: " + area_total + " metros quadrados");

		sc.close();
	}
}
