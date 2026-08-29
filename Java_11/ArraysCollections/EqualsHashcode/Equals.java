package Curso.ArraysCollections.EqualsHashcode;
import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro Silva", "pedro.silva@ezemail.com");
        Usuario u2 = new Usuario("Pedro Silva", "pedro.silva@ezemail.com");

        System.out.println(u1 == u2); // São dois objetos distintos na memoria, então dara 'false'
        System.out.println(u1.equals(u2)); // Comparar se ambos objetos são iguais entre si, forma padrão, dara 'false'
        System.out.println(u2.equals(u1));

        // System.out.println(u1 == u1); Ambos tem mesmo endereço na memoria, então dara 'true'
        // System.out.println(u1.equals(u1)); Tambem dara verdadeiro

        System.out.println(u2.equals(new Date()));
    }
}
