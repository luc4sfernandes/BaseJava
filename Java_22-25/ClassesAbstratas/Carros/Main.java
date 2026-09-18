abstract class Carro {
	int codigo = 10;

	Carro(int codigo){
		this.codigo = codigo;
	}

    abstract void acelerar();
    
    void frear() {
        System.out.println("O carro está freando...");
    }
}

class Caminhao extends Carro {

	Caminhao(int codigo){
		super(codigo);
	}

    void acelerar() {
        System.out.println("O caminhão está acelerando lentamente...");
    }
}

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(32);
        
        caminhao.acelerar();
        caminhao.frear();
        System.out.printf("Código: %d\n", caminhao.codigo);
    }
}
