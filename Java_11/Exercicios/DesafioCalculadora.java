import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args){
		// Ler num1 - Ler num2
		// Qual operação que ele quer fazer - + * / %
		// Fazer a operação
		Scanner entrada = new Scanner(System.in);
		boolean validacao =  false;

		System.out.print("Primeiro numero: ");
		double num1 = entrada.nextDouble();

		System.out.print("Segundo numero: ");
		double num2 = entrada.nextDouble();

		do {
			System.out.print("\n// Operações //\n+\n-\n*\n/\nEscolha: ");
			String operacao = entrada.next();

			validacao =  operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/");

			if(!validacao)
				System.out.println("\nERRO - ESCOLHA UMA OPÇÂO CORRETA");

			else if(operacao.equals("+"))
					System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);

				else if(operacao.equals("-"))
						System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);

				else if(operacao.equals("*"))
						System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);

				else if(operacao.equals("/"))
						System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);

		} while(!validacao);

	}
}
