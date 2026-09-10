public class Personagem {
	private String nome;
	public int nivelDePoder;

	public Personagem(String nomeInit, int nivelDePoderInit){
		nome = nomeInit;
		nivelDePoder = nivelDePoderInit;
	}

	public void alterarNivelDePoder(int i){
		nivelDePoder =+ i;

		if(i >= 0)
			System.out.println("Ouve um acrecimo de: " + i);
		else
			System.out.println("Ouve um decremento de: " + i);	
	}

	public void alterarNome(Personagem personagem, String nomeNovo){
		personagem.nome = nomeNovo;
	}

	public void info(){
		System.out.printf("Nome: %s\nNível: %d\n", nome, nivelDePoder);
	}
}
