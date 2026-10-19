import java.util.Scanner;

public class DesafioConvercao {
	public static void main(String[] args){
		// Usar scanner para pegar 3 strings, seria os ultimos 3 salarios do funcionario
		// Calcular a media usando os 3 anteriores
		// Ele pode usar tanto virgula quanto ponto

		Scanner entrada = new Scanner(System.in);
		String primeiroSalario, segundoSalario, terceiroSalario;

		System.out.print("Primeiro Salario: ");
		primeiroSalario = entrada.nextLine();

		System.out.print("Segundo Salario: ");
		segundoSalario = entrada.nextLine();

		System.out.print("Terceiro Salario: ");
		terceiroSalario = entrada.nextLine();

		// Se você usá-lo diretamente na String (sem nenhum if), ele procura a vírgula no texto inteiro.
		// Se ele achar a vírgula (no começo, meio ou fim), ele troca por ponto.
		// Se ele não achar nenhuma vírgula, ele simplesmente não faz nada e não quebra o código.

		primeiroSalario = primeiroSalario.replace(",", ".");
		double valor1 = Double.parseDouble(primeiroSalario);
		System.out.println("\n// Salarios // \n1* " + valor1);

		segundoSalario = segundoSalario.replace(",", ".");
		double valor2 = Double.parseDouble(segundoSalario);
		System.out.println("2* " + valor2);

		terceiroSalario = terceiroSalario.replace(",", ".");
		double valor3 = Double.parseDouble(terceiroSalario);
		System.out.println("3* " + valor3);

		System.out.println("Media: " + (valor1 + valor2 + valor3) / 3);

		entrada.close();

	}

}
