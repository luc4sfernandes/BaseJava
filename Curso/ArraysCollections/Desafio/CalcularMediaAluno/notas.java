package Curso.ArraysCollections.Desafio.CalcularMediaAluno;
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd;

        do {
            System.out.print("Informe quantidade de notas: ");
            qtd = entrada.nextInt();
            
            if(qtd < 0)
                System.out.println("\nInforme a quantidade de notas correta!!!");    
        
        } while (qtd < 0);

        double[] notas = new double[qtd];
        double totalNotas = 0;

        for(int i = 0; i < qtd; i++){
            int temp = entrada.nextInt();
            notas[i] = temp;
        }

        for (double nota : notas)
            totalNotas += nota;

        System.out.printf("\nMedia: %.1f\n", totalNotas / qtd);

        entrada.close();
    }
}
