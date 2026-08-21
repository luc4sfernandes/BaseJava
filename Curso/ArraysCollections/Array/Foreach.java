package Curso.ArraysCollections.Array;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        // Exemplo 'classico'
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Modo normal: %.1f\n", notas[i]);
        }

        System.out.println();

        // Foreach
        for (double nota : notas) { // Nota vai apotar para o 'elemento atual' no array
            System.out.printf("Forach: %.1f\n", nota);
        }
    }
}
