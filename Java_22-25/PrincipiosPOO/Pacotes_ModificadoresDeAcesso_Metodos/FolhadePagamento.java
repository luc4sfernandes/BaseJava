// import empresa.dados.Funcionario; --> Importar 1 classe só
import empresa.dados.*; // '*' importa todos as classes do pacote

public class FolhadePagamento {
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario("Lucas", 2000);
		System.out.println(funcionario.obterInfo());
	}
}
