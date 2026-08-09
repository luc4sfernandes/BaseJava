package classe; // Ja que a classe 'Produto' esta na mesma pasta, não e preciso importar a classe produto

public class ProdutoTeste {
	public static void main(String[] args){
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		var p2 = new Produto("Caneta Preta", 12.56, 0.29); // --> Consegue tambem inferir um valor

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		// System.out.println(p1.preco * (1 - p1.desconto));
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());		
	}
}
