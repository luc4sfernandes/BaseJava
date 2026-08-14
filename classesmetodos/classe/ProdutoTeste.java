package classesmetodos.classe; // Ja que a classe 'Produto' esta na mesma pasta, não e preciso importar a classe produto

public class ProdutoTeste {
	public static void main(String[] args){
		Produto p1 = new Produto("Notebook", 4356.89);
		var p2 = new Produto("Caneta Preta", 12.56); // --> Consegue tambem inferir um valor

		Produto.desconto = 0.3;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		// System.out.println(p1.preco * (1 - p1.desconto));
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());		
	}
}
