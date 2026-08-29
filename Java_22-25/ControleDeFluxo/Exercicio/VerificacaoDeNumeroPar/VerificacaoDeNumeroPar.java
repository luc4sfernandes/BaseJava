import java.util.Scanner;

public class VerificacaoDeNumeroPar {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("Escolha um numero: ");
		int numero = entrada.nextInt();

		String paridade = (numero % 2 == 0) ? "O número é par" : "O número é impar";
		System.out.println(paridade);
		
	}
}
