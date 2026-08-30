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

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("João","Desenvolvedor", 30);

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);

		}
}
