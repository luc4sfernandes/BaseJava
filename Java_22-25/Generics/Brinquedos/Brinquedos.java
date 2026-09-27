class Carrinho {
	private String modelo;

	public Carrinho(String modelo){
		this.modelo = modelo;
	}

	public String getModelo(){
		return modelo;
	}
}

class Boneca {
	private String nome;

	public Boneca(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}
}

public class Brinquedos {
	public static void main(String[] args){
		Carrinho c = new Carrinho("Hot Wheels");
		Boneca b = new Boneca("Barbie");

		System.out.println("Carrinho: " + c.getModelo());
		System.out.println("Boneca: " + b.getNome());
	}
}
