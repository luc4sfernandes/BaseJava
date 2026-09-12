class Pessoa {
	String nome;
	int idade;

	public Pessoa(String nomeInit, int idadeInit){
		this.nome = nomeInit;
		this.idade = idadeInit; 
	}
}

class Estudante extends Pessoa {
	int matricula;

	public Estudante(String nome, int idade, int matriculaInit){
		super(nome, idade);
		this.matricula = matriculaInit;
	}
}

public class main {
	public static void main(String[] args){
		Estudante estudante = new Estudante("Lucas", 19, 1234);
		System.out.printf("Nome: %s\nIdade: %d\nMatricula: %d\n", estudante.nome, estudante.idade, estudante.matricula);		
	}
}
