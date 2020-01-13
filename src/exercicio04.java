import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/* Ler uma quantidade indeterminada de duplas de valores (2 valores de
		cada vez). Escrever para cada dupla lida uma mensagem que indique se ela foi informada em
		ordem crescente ou decrescente. A repetição será encerrada ao ser fornecido valores iguais
		para os elementos da dupla. */
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite dois valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (a!=b) {
			if (a < b) {
				System.out.println("Os números foram digitados em ordem crescente.");
				} else {
				System.out.println("Os números foram digitados em ordem decrescente.");
		}
			
		System.out.println("\nDigite dois valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		}
		
		
		sc.close();

	}

}