import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		/*  Crie um programa em Java que receba do usu�rio um n�mero inteiro
		positivo e informe os totais de n�meros pares e �mpares encontrados entre 1 e o n�mero
		digitado + o somat�rio dos pares e �mpares separadamente.  */
		
		Scanner sc = new Scanner(System.in);
		int num, cont = 1, somaPares = 0, somaImpares = 0, totalPares = 0, totalImpares = 0;
		
		System.out.print("Digite um n�mero inteiro: ");
		num = sc.nextInt();
		
		while (cont < num) {
			if (cont%2==0) {
				System.out.print("\n"+cont + " � par.");
				somaPares = somaPares + cont;
				totalPares++;
			} else {
				System.out.print("\n"+cont + " � �mpar.");
				somaImpares = somaImpares + cont;
				totalImpares++;
			}
			cont++;
		}
		
		System.out.println();
		System.out.printf("\nTotal de n�meros pares s�o: %d.",totalPares);
		System.out.printf("\nTotal de n�meros �mpares s�o: %d.",totalImpares);
		System.out.printf("\nA soma dos n�meros �mpares �: %d.",somaImpares);
		System.out.printf("\nA soma dos n�meros pares �: %d.",somaPares);
		
		
		sc.close();

	}

}