package empresa.dados;

public class Funcionario{
	private String nome;
	private double salario;

	// Métodos contrutores
	public Funcionario(String nomeInit, double salarioInit){
		nome = nomeInit;
		salario = salarioInit;	
	}

	// Métodos
	public String obterInfo(){
		return "Nome: " + nome + ", Salario: " + salario;
	}
	
}
