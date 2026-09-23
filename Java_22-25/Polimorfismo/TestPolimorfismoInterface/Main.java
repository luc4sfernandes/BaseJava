// Interface
interface Veiculo {
	void acelerar();
}

class Carro implements Veiculo {
	public void acelerar(){
		System.out.println("O carro está acelerando!!!");
	}
}

class Moto implements Veiculo {
	public void acelerar(){
		System.out.println("A moto está acelerando!!!");
	}
}

public class Main {
	public static void main(String[] args){

		Veiculo carro = new Carro();
		Veiculo moto = new Moto();

		carro.acelerar();
		moto.acelerar();
	}
}
