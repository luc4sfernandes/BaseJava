package Curso.classesmetodos.classe.DesafioModulo;

public class Janta {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 200);
        Comida c2 = new Comida("Feijão", 50);
        Comida c3 = new Comida("Frango Grelhado", 100);
        Pessoa p1 = new Pessoa("Lucas", 67);

        p1.printarPessoa();
        p1.comer(c1.comida, c1.pesoDaComida);
        p1.comer(c2.comida, c2.pesoDaComida);
        p1.comer(c3.comida, c3.pesoDaComida);
        p1.printarPessoa();
    }
}
