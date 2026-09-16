// Cria o 'rascunho' dos métodos
interface Animal {
	 String DESCRICAO = "Animal é um ser vivo importante!";
	 void fazerSom(); // Método abstrato
}

// Classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {

	public void fazerSom() {
		System.out.println("O cachorro faz: Au Au!");
	}
}

// Classe Gato que implementa a interface Animal
class Gato implements Animal {
	public void fazerSom() {
		System.out.println("O gato faz: Miau Maiu!");
	}
}

public class TestInterface {
	public static void main(String[] args){

		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom(); // Deve imprimir "O cachorro faz: Au Au!"
		
		Gato gato = new Gato();
        gato.fazerSom(); // Deve imprimir "O gato faz: Miau Miau!"

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);		
	}
}
