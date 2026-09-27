class Caixa<T>{
	int capacidade, indice;
	T elemento;

	public Caixa(int capacidade){
		this.capacidade = capacidade;
	}

	public void adicionar(T elemento, int indice){
		this.elemento = elemento;
		this.indice = indice;
	}

	public T obter(int indice){
		return elemento;
	}
	
}

public class Main {
	public static void main(String[] args){
		Caixa<Double> precos = new Caixa<>(1);
		Caixa<Character> letras = new Caixa<>(1);

		precos.adicionar(232.3, 2);
		letras.adicionar('A', 3);

		System.out.println(precos.obter(2));
		System.out.println(letras.obter(2));
	}
}
