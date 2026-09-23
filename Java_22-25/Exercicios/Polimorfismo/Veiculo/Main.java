abstract class Veiculo {
	private String placa;
	private int ano;

	Veiculo(String placa, int ano){
		this.placa = placa;
		this.ano = ano;
	}

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

	abstract void exibirInformacoes(); // Forçar a implementação das outras classes filhas
}

class Onibus extends Veiculo {
	int assentos;

	Onibus(String placa, int ano, int assentos){
		super(placa, ano);
		this.assentos = assentos;
	}

	public void exibirInformacoes(){
		System.out.printf("* Onibus *\nAssentos: %d\nPlaca: %s\nAno: %d\n", assentos, getPlaca(), getAno());
	} 
}

class Caminhao extends Veiculo {
	int eixos;
	
	Caminhao(String placa, int ano, int eixos){
		super(placa, ano);
		this.eixos = eixos;
	}

	public void exibirInformacoes(){
		System.out.printf("* Caminhão *\nEixos: %d\nPlaca: %s\nAno: %d\n", eixos, getPlaca(), getAno());
	} 	
}

public class Main {
	public static void main(String[] args){
		Veiculo onibus = new Onibus("111-222-333", 1999, 12);
		Veiculo caminhao = new Caminhao("999-888-777", 2004, 2);

		onibus.exibirInformacoes();
		System.out.println();
		caminhao.exibirInformacoes();
	}
}
