package classe;

public class Produto {
	// Criar 3 atributos
	String nome;
	double preco;
	double desconto; // Estara entre 0 e 1

	double precoComDesconto(){ // Ja tem esses dados na classe então não precisa de uma entrada de dados
		return preco * (1 - desconto);
	}

}
