import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/* Escreva um programa em Java para repetir a leitura de uma senha (um
		n�mero positivo de 4 d�gitos) at� que ela seja v�lida. Para cada leitura de senha incorreta,
		escrever a mensagem "SENHA INV�LIDA". Quanto a senha for informada corretamente deve
		ser impressa a mensagem "ACESSO PERMITIDO" e o algoritmo encerrado. Considere que a
		senha correta � o valor 1234. */
		
		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.print("Digite a senha de 4 d�gitos: ");
		senha = sc.nextInt();
		
		while (senha != 1234) {
			System.out.println("Senha incorreta digite novamente.");
			senha = sc.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO.");
		
		sc.close();

	}

}
