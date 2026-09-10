public class Livro {
	public String titulo;
	private String autor;
	protected int anoDaPublicacao;
	float preco;

	// Metodos Construtores
	public Livro(){			
		titulo = "Desconhecido";
		autor = "Desconhecido";
		anoDaPublicacao = 0;
		preco = 0;
	}

	public Livro(String tituloInit, String autorInit){
		titulo = tituloInit;
		autor = autorInit;
		anoDaPublicacao = 0;
		preco = 0;
	}

	public Livro(String tituloInit, String autorInit, int anoDaPublicacaoInit, int precoInit){
		titulo = tituloInit;
		autor = autorInit;
		anoDaPublicacao = anoDaPublicacaoInit;
		preco = precoInit;
	}

	public void info(){
		System.out.printf("Título: %s\nAutor: %s\nPublicação: %d\nPreço: %.2f\n",titulo, autor, anoDaPublicacao, preco);
	}
	
}
