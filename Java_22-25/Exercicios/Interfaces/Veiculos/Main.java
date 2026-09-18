interface Veiculo {
	void iniciar();
	void parar();

	default void buzinar(){ System.out.println("Buzinando"); }
}

class Carro implements Veiculo { 
	public void iniciar(){
		System.out.println("Carro iniciando...");
	}

	public void parar(){
		System.out.println("Carro parando...");
	}
}

class Caminhao implements Veiculo { 
	public void iniciar(){
		System.out.println("Caminhão iniciando...");
	}

	public void parar(){
		System.out.println("Caminhão parando...");
	}
}

public class Main {
	public static void main(String[] args){
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();

		carro.iniciar();
		carro.buzinar();
		carro.parar();

		System.out.println();

		caminhao.iniciar();
		caminhao.buzinar();
		caminhao.parar();
	}
}
