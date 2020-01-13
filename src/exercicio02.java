import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		/* Crie um programa em Java que receba do usu�rio dois n�meros inteiros
		positivos A e B (e garantindo que A < B), encontre e imprima os n�meros divis�veis por 5 no
		intervalo de n�meros entre A e B (incluindo A e B) e tamb�m a soma dos n�meros
		encontrados. */
		
		Scanner sc = new Scanner(System.in);
		int a, b, soma = 0;
		
		System.out.println("Digite dois n�meros em ordem crescente: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (a > b) {
			System.out.println("Por favor, digite os dois n�meros em ordem crescente:");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		while (a <= b) {
			if (a%5==0) {
				System.out.printf("%d � divis�vel por 5.\n", a);
				soma = soma + a;
			}
			a++;
		}
		
		System.out.printf("A soma dos n�meros encontrados �: %d.\n", soma);
		
		sc.close();
	}

}