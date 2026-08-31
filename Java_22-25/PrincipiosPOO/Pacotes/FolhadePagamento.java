// import empresa.dados.Funcionario; --> Importar 1 classe só
import empresa.dados.*; // '*' importa todos as classes do pacote

public class FolhadePagamento {
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario("Lucas", 2362.98);
		System.out.println(funcionario.nome);
	}
}
