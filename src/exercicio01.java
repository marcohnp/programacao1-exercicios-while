import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		/*  Crie um programa em Java que receba do usuário um número inteiro
		positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número
		digitado + o somatório dos pares e ímpares separadamente.  */
		
		Scanner sc = new Scanner(System.in);
		int num, cont = 1, somaPares = 0, somaImpares = 0, totalPares = 0, totalImpares = 0;
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		while (cont < num) {
			if (cont%2==0) {
				System.out.print("\n"+cont + " é par.");
				somaPares = somaPares + cont;
				totalPares++;
			} else {
				System.out.print("\n"+cont + " é ímpar.");
				somaImpares = somaImpares + cont;
				totalImpares++;
			}
			cont++;
		}
		
		System.out.println();
		System.out.printf("\nTotal de números pares são: %d.",totalPares);
		System.out.printf("\nTotal de números ímpares são: %d.",totalImpares);
		System.out.printf("\nA soma dos números ímpares é: %d.",somaImpares);
		System.out.printf("\nA soma dos números pares é: %d.",somaPares);
		
		
		sc.close();

	}

}