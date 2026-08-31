class Funcionario {

	String nome;
	String cargo;
	int idade;

	// Este é o construtor
	Funcionario(String nomeInit, String cargoInit, int idadeInit) { // Por Init Melhora a legibildade de quem e quem do construtor
		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}

	// Sobrecarga de parametros, quando a mais de 1 construtor na classe
	Funcionario(String nomeInit) {
			nome = nomeInit;
	}

	// Contrutor default em java
	Funcionario(){
		
	}
	
	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("João");

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);

		}
}
