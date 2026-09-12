class Veiculo {
	public void acelerar(){
		System.out.println("Está acelerando: vrum vrum");
	}
}

class Carro extends Veiculo {
	public void acelerar(){
		System.out.println("Carro esta acelerando");
	}
}

public class main {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.acelerar();
	}
}
