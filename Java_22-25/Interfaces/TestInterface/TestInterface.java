// Cria o 'rascunho' dos métodos
interface Servivo {
	void respirar();
}

interface Animal extends Servivo {
	 String DESCRICAO = "Animal é um ser vivo importante!"; // --> Cria uma variavel global imutavel
	 void fazerSom(); // Método abstrato
}

// Classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {

	public void respirar(){
		System.out.println("Esse ser vivo está respirando!");
	}

	public void fazerSom() {
		System.out.println("O cachorro faz: Au Au!");
	}
}

// Classe Gato que implementa a interface Animal
class Gato implements Animal {

	public void respirar(){
		System.out.println("Esse ser vivo está respirando!");
	}

	public void fazerSom() {
		System.out.println("O gato faz: Miau Maiu!");
	}
}

public class TestInterface {
	public static void main(String[] args){

		Cachorro cachorro = new Cachorro();
		cachorro.respirar();
		cachorro.fazerSom(); // Deve imprimir "O cachorro faz: Au Au!"
		
		Gato gato = new Gato();
		gato.respirar();
        gato.fazerSom(); // Deve imprimir "O gato faz: Miau Miau!"

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);		
	}
}
