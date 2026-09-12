class Funcionario {
	private String nome;
	private double salario;

	 // Getter: retorna o valor do nome
	 public String getNome() {
	 	return nome;
	}
	
     // Setter: altera o valor do nome	   
	 public void setNome(String novoNome) {	
	 	this.nome = novoNome;
	 }

	 public double getSalario(){
	 	return salario;
	 }

	 public void setSalario(double novoSalario){
	 	this.salario = novoSalario;
	 }

	// Metodos
	public void addAumento(double valor){
		salario += valor;
	}

	public void ganhoAnual(){
		System.out.printf("Ganho anual: %.2f\n", (salario * 12));
	}	
}

class Assistente extends Funcionario {
	public void ganhoAnual(){
		System.out.printf("Ganho anual: %.2f\n", (getSalario() * 12) + 1000);
	}
}

public class TesteHeranca {
	public static void main(String[] args){
		Assistente assistente = new Assistente();

		assistente.setNome("João");
		assistente.setSalario(3000);
		assistente.addAumento(500);

		System.out.println("Nome: " + assistente.getNome());
		assistente.ganhoAnual();
	}
}
