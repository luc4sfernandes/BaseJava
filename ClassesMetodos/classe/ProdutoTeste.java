package classe; // Ja que a classe 'Produto' esta na mesma pasta, não e preciso importar a classe produto

public class ProdutoTeste {
	public static void main(String[] args){
		Produto p1 = new Produto();
		// p1.nome = ""

		var p2 = new Produto(); // --> Consegue tambem inferir um valor 	
	}
}
