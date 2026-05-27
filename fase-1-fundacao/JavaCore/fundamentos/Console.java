import java.util.Scanner;

public class Console {

	public static void main(String[] args){

		System.out.print("Bom"); // System.out --> Saida do sistema
		System.out.print(" dia!\n\n");

		System.out.println("Bom"); // System.out --> Saida do sistema
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // '%n' == \n

		System.out.printf("Salário: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "João");

		// Parte importante !!!

		// Não se importe muito com a sintaxe, apenas foque que quer pegar informações do console!!!
		Scanner entrada = new Scanner(System.in); // System.in --> Entrada do sistema

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine(); // Vai ficar o usuario entrar com a informação no console

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // .nextInt() --> Entrada fica "forçada" em numeros inteiros

		System.out.println("\nNome: " + nome + "\nIdade: " + idade);

		entrada.close(); // Precisa fechar ele porque fica ocupando recursos da maquina
	}
}
