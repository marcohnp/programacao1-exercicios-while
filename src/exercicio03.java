import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		/*Crie um programa em Java que receba do usu�rio um n�mero inteiro
		positivo e determine se ele � um �n�mero perfeito�. Um n�mero perfeito � aquele que � igual
		� soma dos seus divisores, exceto dele mesmo (ou seja, 0 e 1 n�o s�o n�meros perfeitos). */
		
		
		Scanner sc = new Scanner(System.in);
		int numeroLido, cont = 1, soma = 0;
		
		System.out.print("Digite um n�mero (exceto 0 e 1): ");
		numeroLido = sc.nextInt();
		
		while (cont < numeroLido) {
			if (numeroLido%cont==0) {
				System.out.printf("%d � divisor de %d.\n", cont, numeroLido);
				soma = soma + cont;
			}
			cont++;
		}
		
		if (soma == numeroLido) {
			System.out.printf("%d � um n�mero perfeito, pois seu valor � a soma de seus divisores.\n", numeroLido);
			} else {
			System.out.printf("%d n�o � um n�mero perfeito.\n", numeroLido);
		}
		
		
		
		
		sc.close();

	}

}
