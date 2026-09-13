class Animal {
	public void fazerSom(){
		System.out.println("O animal faz um som");
	}
}

class Cachorro extends Animal {

	 @Override // <-- Atenção aqui!

	public void fazerSom(){
		System.out.println("O cahorro late");
	}
}

public class main {
	public static void main(String[] args){
		Cachorro dog = new Cachorro();
		dog.fazerSom();
	}
}
