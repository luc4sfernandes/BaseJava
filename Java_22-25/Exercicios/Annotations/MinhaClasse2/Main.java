class MinhaClasse {
	public int soma(int i, int j){
		return i + j;
	}

	@Deprecated // Não deve ser usado, defasado
	public int produto(int i, int j){
		return i * j;
	}
}

public class Main {
	public static void main(String[] args){
		MinhaClasse operacao = new MinhaClasse();

		System.out.println(operacao.soma(5, 6));
		System.out.println(operacao.produto(5, 6)); // Deve ocorrer um aviso!
	}
}
