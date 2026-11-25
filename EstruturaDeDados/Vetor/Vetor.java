import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	// Construtor
	public Vetor(int elementos){
		this.elementos = new String[elementos];
		this.tamanho = 0; // Incialização padrão
	}

	public String[] getElementos(){
		return elementos;
	}
	
	/*public void adiciona(String elemento){
		for(int i = 0; i < this.elementos.length; i++){
			if(this.elementos[i] == null){
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/

	/*
	// Função mais eficiente que a anterior
	public void adiciona(String elemento) throws Exception {

		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			// Dispara uma exceção proposital!
			throw new Exception("Vetor cheio, Não e possivel adicionar o elemento!");
		}
		*/

		public boolean adiciona(String elemento) {
		
			if(this.tamanho < this.elementos.length){
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			} 
			return false;
	}
}
