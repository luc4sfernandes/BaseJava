package Curso.ArraysCollections.Array;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[4]; // Declaração de um array
        System.out.println(Arrays.toString(notasAlunoA)); // Imprimir o array formatado

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8; // Posso por em int que ele vai converter para double
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA)); // Imprimir o array formatado

        double totalNotaA = 0;
        for(int i = 0; i < notasAlunoA.length; i++)
            totalNotaA += notasAlunoA[i];

        System.out.println(totalNotaA / notasAlunoA.length); // Divisão entre int e double, sempre da double

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        double totalNotaB = 0;

        System.out.println(Arrays.toString(notasAlunoA)); // Imprimir o array formatado

        for(int i = 0; i < notasAlunoB.length; i++)
            totalNotaB += notasAlunoB[i];

        System.out.println(totalNotaB / notasAlunoB.length);
    }
}
