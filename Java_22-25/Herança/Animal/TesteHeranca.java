// Super classe ou classe pai
class Animal {
	public String nome;
	void comer(){
		System.out.println("Esse animal esta comendo");
	}

	public void fazerSom(){
		System.out.println("O animal faz um som");
	}
}

// Subclasse ou classe filha
class Cachorro extends Animal {
	void latir(){
		System.out.println("Cachorro esta latindo: Au Au Au");
	}

	// Sobrescrita de Métodos
	public void fazerSom(){
		super.fazerSom(); // Chamou o metodo da superclasse, ou classe pai mesmo tendo sobrescrita de metodos
		System.out.println("O cachorro late");
	}
}

public class TesteHeranca {
	public static void main(String[] args){
		Cachorro dog = new Cachorro();
		dog.nome = "Rex"; // Herdou a String, assim podendo atribuir nome a essa filha

		dog.latir();
		dog.comer(); // Utilizou um metodo da classe pai!

		dog.fazerSom(); // Utilizou a sobrescrita de métodos
	}
}
