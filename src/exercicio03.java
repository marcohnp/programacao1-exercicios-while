import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		/*Crie um programa em Java que receba do usuário um número inteiro
		positivo e determine se ele é um “número perfeito”. Um número perfeito é aquele que é igual
		à soma dos seus divisores, exceto dele mesmo (ou seja, 0 e 1 não são números perfeitos). */
		
		
		Scanner sc = new Scanner(System.in);
		int numeroLido, cont = 1, soma = 0;
		
		System.out.print("Digite um número (exceto 0 e 1): ");
		numeroLido = sc.nextInt();
		
		while (cont < numeroLido) {
			if (numeroLido%cont==0) {
				System.out.printf("%d é divisor de %d.\n", cont, numeroLido);
				soma = soma + cont;
			}
			cont++;
		}
		
		if (soma == numeroLido) {
			System.out.printf("%d é um número perfeito, pois seu valor é a soma de seus divisores.\n", numeroLido);
			} else {
			System.out.printf("%d não é um número perfeito.\n", numeroLido);
		}
		
		
		
		
		sc.close();

	}

}
