abstract class Animal { // SuperClasse
	public abstract void fazerSom();

	public void tipoObjeto(){
		System.out.println("Objeto do tipo Animal!");
	}
}

class Cachorro extends Animal { // Subclasse Cachorro
	public void fazerSom(){
		System.out.println("O cachorro faz: Au Au!");
	}
}

class Gato extends Animal { // Subclasse Gato
	public void fazerSom(){
		System.out.println("O gato faz: Miau Miua");
	}
}

public class TestPolimorfismo {
	public static void main(String[] args){
		// Criando objetos polimórficos
		Animal meuCachorro = new Cachorro();
		Animal meuGato = new Gato();

		meuCachorro.fazerSom();
		meuGato.fazerSom();

		meuCachorro.tipoObjeto();
		meuGato.tipoObjeto();		
	}
}
