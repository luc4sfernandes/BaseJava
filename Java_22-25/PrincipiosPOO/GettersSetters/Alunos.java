public class Alunos {
	private String nome;

	public Alunos(String nomeInit){
		nome = nomeInit;
	}

	public void setnome(String novoNome){ // Altera a variavel
		nome = novoNome;
	}

	public String getnome(){ // Retorna a variavel
		return nome;
	}
}
