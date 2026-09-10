public class Carro {
	String marcaDoCarro;
	String modeloDoCarro;
	int anoDoCarro;

	// Metodos Contrutores
	public Carro(String marca, String modelo, int ano){
		marcaDoCarro = marca;
		modeloDoCarro = modelo;
		anoDoCarro = ano;
	}

	Carro(){
		
	}

	// Metodos
	public void exibirDetalhes(){
		System.out.printf("Marca: %s\nModelo: %s\nAno: %d\n", marcaDoCarro, modeloDoCarro, anoDoCarro);
	}
}
