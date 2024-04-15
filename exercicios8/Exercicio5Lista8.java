package exercicios8;

public class Exercicio5Lista8 {
	public static void main(String[] args) {
		System.out.println("Potências de 3, variando do expoente 0 até o expoente 15");

		int base = 3;
		int resultado = 1;

		for (int expoente = 0; expoente <= 15; expoente++) {
			System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

			resultado *= base;
		}
	}
}
