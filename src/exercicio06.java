import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		/*  Escreva um programa em Java que receba um n�mero e fa�a a tabuada
		desse n�mero de 1 a 10. Parar o algoritmo quando o usu�rio digitar um n�mero negativo. */
		
		
		Scanner sc = new Scanner(System.in);
		int numero = 1, cont = 1, resultado;
		
		
		
		while (numero > 0) {
			System.out.print("Digite um n�mero: ");
			numero = sc.nextInt();
			if (numero > 0) {
				System.out.printf("A tabuada do %d �: \n", numero);
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