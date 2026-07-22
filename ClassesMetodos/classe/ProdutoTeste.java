package classe; // Ja que a classe 'Produto' esta na mesma pasta, não e preciso importar a classe produto

public class ProdutoTeste {
	public static void main(String[] args){
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;

		var p2 = new Produto(); // --> Consegue tambem inferir um valor
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		// System.out.println(p1.preco * (1 - p1.desconto));
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());		
	}
}
