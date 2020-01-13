import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		/*  Escreva um programa em Java que receba um número e faça a tabuada
		desse número de 1 a 10. Parar o algoritmo quando o usuário digitar um número negativo. */
		
		
		Scanner sc = new Scanner(System.in);
		int numero = 1, cont = 1, resultado;
		
		
		
		while (numero > 0) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			if (numero > 0) {
				System.out.printf("A tabuada do %d é: \n", numero);
				while (cont <= 10) {
				resultado = numero * cont;
				System.out.printf("%d * %d = %d.\n", numero, cont, resultado);
				cont++;
				}
		
			} else {
				System.out.println("Programa Finalizado!");
			}
		
			cont = 0;
		}
		
		
		sc.close();


	}

}