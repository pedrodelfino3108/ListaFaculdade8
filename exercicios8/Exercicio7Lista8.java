package exercicios8;

public class Exercicio7Lista8 {
	public static void main(String[]args) {
		int n = 15;
		int termo1 = 1;
		int termo2 = 1;
		
		System.out.println("Série de Fibonacci até o décimo quinto termo:");
		
		System.out.println(termo1 + ", " + termo2);
		
		for(int i = 3; i <= n; i++) {
			int termo = termo1 + termo2;
			System.out.println(", " + termo);
			termo1 = termo2;
			termo2 = termo;
		}
	}
}
