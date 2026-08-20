package Curso.classesmetodos.classe.DesafioModulo;

public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(String nomeComida, double pesoComida){
        System.out.printf("%s comeu %.3f\n", nomeComida, pesoComida);
        peso += pesoComida;
    }

    public void printarPessoa(){
        System.out.printf("Nome: %s\nPeso: %.3f\n", nome, peso);
    }
}
