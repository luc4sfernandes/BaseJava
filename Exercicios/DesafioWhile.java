import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args){
		// Calcular a media de notas de uma turma
		// So que não sei quantas pessoas tem nessa turma
		// nota valida de 10 a 0
		// Sair - Quando o usario colocar -1
		Scanner entrada = new Scanner(System.in);
		int notaTotal = 0, notaAtual = 0, i = 0;

		while(notaAtual != -1){
			System.out.printf("Nota do aluno %d: ", i + 1);
			notaAtual = entrada.nextInt();

			if(notaAtual == -1){
				System.out.printf("Media: %d\n", notaTotal / i);
			}
			else if(notaAtual > 10 || notaAtual < 0){
				System.out.println("\nERRO - ESCOLHA UMA NOTA ENTRE 10 e 0\n");
				notaAtual = 0;
				i--;
			}

			notaTotal += notaAtual;
			i++;
		}

	}
}
