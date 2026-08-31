package empresa.dados;

public class Funcionario{
	private String nome;
	double salario;

	public Funcionario(String nomeInit, double salarioInit){
		nome = nomeInit;
		salario = salarioInit;
		
		System.out.printf("Nome: %s\nSalario: %.2f\n", nome, salario);
	}
}
