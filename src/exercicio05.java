import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/* Escreva um programa em Java para repetir a leitura de uma senha (um
		número positivo de 4 dígitos) até que ela seja válida. Para cada leitura de senha incorreta,
		escrever a mensagem "SENHA INVÁLIDA". Quanto a senha for informada corretamente deve
		ser impressa a mensagem "ACESSO PERMITIDO" e o algoritmo encerrado. Considere que a
		senha correta é o valor 1234. */
		
		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.print("Digite a senha de 4 dígitos: ");
		senha = sc.nextInt();
		
		while (senha != 1234) {
			System.out.println("Senha incorreta digite novamente.");
			senha = sc.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO.");
		
		sc.close();

	}

}
