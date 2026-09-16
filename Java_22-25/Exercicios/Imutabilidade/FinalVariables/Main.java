class FinalVariables {
 
	public final int numeroMaximo = 100;
	public final String mensagem = "Bem-vindo ao mundo da programação!";

	public int Numero(){
		return numeroMaximo;		
	}

	public String Mensagem(){
		return mensagem;
	}
}

public class Main {
	public static void main(String[] args){
		FinalVariables variaveisFinais = new FinalVariables();

		System.out.println("Número maximo: " + variaveisFinais.Numero());
		System.out.println("Mensagem: " + variaveisFinais.Mensagem());		
	}
}
