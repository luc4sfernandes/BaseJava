package Curso.classesmetodos.classe.valornulo; // ou ajuste conforme o nome exato das pastas

public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        String s2 = null;
        System.out.println(s2.concat("?????")); // Não roda!
    }
}
