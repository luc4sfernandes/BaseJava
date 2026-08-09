package classe;

public class Produto {
	// Criar 3 atributos
	String nome;
	double preco;
	double desconto; // Estara entre 0 e 1

	// Metodo contrutor
	Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	// Metodos
	double precoComDesconto(){ // Ja tem esses dados na classe então não precisa de uma entrada de dados
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto - descontoDoGerente);
	}

}
