class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal { // Subclasse Cachorro
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal { // Subclasse Gato
    public void fazerSom() {
        System.out.println("O gato faz: Miau Miau!");
    }
}

public class TestPolimorfismo {

    public static void main(String[] args) {
        
        // Criando objetos polimórficos
        Object meuCachorro = new Cachorro();
        Object meuGato = new Gato();

        // meuCachorro.fazerSom(); Erro de compilação direta se descomentado, pois Object não tem fazerSom()
        
        // Casting Object para Cachorro
        Cachorro objConvertido = (Cachorro) meuCachorro; 
        objConvertido.fazerSom();

        // Casting direto na chamada do método
        ((Cachorro) meuCachorro).fazerSom();
    }
}
