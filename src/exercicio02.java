import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		/* Crie um programa em Java que receba do usuário dois números inteiros
		positivos A e B (e garantindo que A < B), encontre e imprima os números divisíveis por 5 no
		intervalo de números entre A e B (incluindo A e B) e também a soma dos números
		encontrados. */
		
		Scanner sc = new Scanner(System.in);
		int a, b, soma = 0;
		
		System.out.println("Digite dois números em ordem crescente: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (a > b) {
			System.out.println("Por favor, digite os dois números em ordem crescente:");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		while (a <= b) {
			if (a%5==0) {
				System.out.printf("%d é divisível por 5.\n", a);
				soma = soma + a;
			}
			a++;
		}
		
		System.out.printf("A soma dos números encontrados é: %d.\n", soma);
		
		sc.close();
	}

}