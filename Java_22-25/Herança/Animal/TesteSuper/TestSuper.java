class Animal {
	String nome;

	// Contrutor da classe pai

	Animal(String nome){ // <--- super(nome);
		this.nome = nome;
	}
}

class Cachorro extends Animal {
	String raca;

	Cachorro(String nome, String raca) {
		super(nome); // Chama o contrutor da superclasse animal
		this.raca = raca;
	}
}

public class TestSuper {
	public static void main(String[] args){
		Cachorro dog = new Cachorro("Rex", "Labrador");
		System.out.println("O nome do animal: " + dog.nome);
		System.out.println("Raça do cachorro: " + dog.raca);
	}
}
