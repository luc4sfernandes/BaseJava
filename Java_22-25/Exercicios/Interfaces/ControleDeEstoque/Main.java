import java.util.Scanner;

interface Produto {
	String getNome();
	int getQuantidade();

	void adicionarQuantidade(int quantidade);
	void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto{
	private String nome;
	private int quantidade;

	ProdutoImpl(String nome, int quantidade){
		this.nome = nome;
		this.quantidade = quantidade;
	}

	 // Sobrescrita obrigatória dos getters definidos na interface
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    public void adicionarQuantidade(int quantidade){
    	this.quantidade += quantidade;
    }

     public void removerQuantidade(int quantidade){
    	this.quantidade -= quantidade;
    }

}

public class Main {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		ProdutoImpl produto = new ProdutoImpl("PS5", 5);

		System.out.printf("Nome: %s\nQuantidade: %d\n", produto.getNome(), produto.getQuantidade());

		System.out.printf("Quantos %s quer adicionar: ", produto.getNome());
		produto.adicionarQuantidade(entrada.nextInt());

		System.out.printf("Quantos %s quer remover: ", produto.getNome());
		produto.removerQuantidade(entrada.nextInt());

		System.out.printf("Nome: %s\nQuantidade: %d\n", produto.getNome(), produto.getQuantidade());
	} 
}
