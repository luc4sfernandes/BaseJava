public class Produto{
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nomeInit, double precoInit, int quantidadeInit){
		nome = nomeInit;
		preco = precoInit;
		quantidadeEmEstoque = quantidadeInit;
	}

	public void exibir(){
		System.out.printf("Nome %s\nPreço: %.2f\nQuantidade em Estoque: %d\n", nome, preco, quantidadeEmEstoque);
	}
}
