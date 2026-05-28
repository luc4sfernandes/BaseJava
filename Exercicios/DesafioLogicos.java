// Trabalho na terça (V ou F)
// Trabalho na quinta (V ou F)
// Se ambos for verdadeira, vai comprar uma televisão de 50`
// Se um dos dois for verdadeiro, vai comprar uma televisão de 32`
// Indepedende dos dois acima, vai comprar sorvete
// Se não acontecer, vai ficar em casa --> Falar se sim ou não tomou sorvete

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		boolean booTerca = false, booQuinta = false, booErro;

		// Verefica se fez o trabalho terça //
		do {
			System.out.print("Fez o trabalho de Terça ?\n(S/N): ");
			String texto = entrada.nextLine().toUpperCase();

			booErro = !texto.startsWith("S") && !texto.startsWith("N"); // Se for diferente de S ou N --> retorna verdadeiro

			if(booErro)
				System.out.println("\nERRO - ESCOLHA (S) OU (N)");
			else
				booTerca = texto.startsWith("S"); // Ele verifica se ele efz ou não o trabalho

		} while(booErro);

		// Verifica se fez o trabalho quinta //
		do {
			System.out.print("\nFez o trabalho de Quinta?\n(S/N): ");
			String texto = entrada.nextLine().toUpperCase();

			booErro = !texto.startsWith("S") && !texto.startsWith("N"); // Se for diferente de S ou N --> retorna verdadeiro

			if(booErro)
				System.out.println("\nERRO - ESCOLHA (S) OU (N)");
			else
				booQuinta = texto.startsWith("S");

		} while(booErro);

		if(booTerca && booQuinta){
			System.out.println("Vamos comprar uma televisão 50` polegadas!");
			System.out.println("Tambem vamos tomar sorvete ;)");
		} else if (booTerca || booQuinta){
			System.out.println("Vamos comprar uma televisão 32` polegadas!");
			System.out.println("Tambem vamos tomar sorvete ;)");
		} else {
			System.out.println("Não vamos comprar a tv... nem o sorvete ;(");
		}

		entrada.close();
	}
}
