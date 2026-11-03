package empresa.dados;
public class TestePackage {
	public TestePackage() {
		Funcionario funcionario = new Funcionario("Lucas", 2000);
		System.out.println(funcionario.obterInfo());
	}
}
