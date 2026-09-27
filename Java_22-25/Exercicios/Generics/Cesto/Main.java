class Cesto<T> {
	private T conteudo;

	public void guardar(T coisa){
		this.conteudo = coisa;
	} 

	public T pegar(){
		return conteudo;
	}
}

class Peixe {
	String nome;
	int tamanho;
}

class Polvo {
	String nome;
	int tentaculos;
}

public class Main {
	public static void main(String[] args){
		Cesto<Peixe> peixe = new Cesto<>();
		Cesto<Polvo> polvo = new Cesto<>();

		peixe.guardar(new Peixe());
		polvo.guardar(new Polvo());

		System.out.println(peixe.pegar());
		System.out.println(polvo.pegar());
	}
}
