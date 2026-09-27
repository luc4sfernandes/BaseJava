// Definiu um tipo para classe GENERICA
public class Caixa<T> { 
	private T coisaNaCaixa;

	public void guardar(T coisa){
		this.coisaNaCaixa = coisa;		
	}

	public T pegar(){
		return coisaNaCaixa;
	}

	public static void main(String[] args){
		// Criando uma caixa para quardar String
		Caixa<String> caixaDeTexto = new Caixa<>();

		caixaDeTexto.guardar("Oi, mundo!");
		System.out.println(caixaDeTexto.pegar()); // Imprime: Oi, mundo!

		// Criando uma caixa para quardar Inteiros
		Caixa<Integer> caixaDeInteiros = new Caixa<>();

		caixaDeInteiros.guardar(100);
		System.out.println(caixaDeInteiros.pegar()); // Imprime: 100
	}
}
