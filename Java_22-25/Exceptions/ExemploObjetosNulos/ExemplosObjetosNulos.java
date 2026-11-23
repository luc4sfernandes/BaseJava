public class ExemplosObjetosNulos{
	public static void main(String[] args){
		String nome = null;

		try {
			int tamanhoNome = nome.length(); // Gerado a exceção
			System.out.println("Tamanho do Nome: " + tamanhoNome); // Não executa!
			
		} catch (NullPointerException e) {
			System.out.println("Problema: Variavel Nula!");

		} finally {
			System.out.println("Sofware Terminado!");
		}
	}
}
