public class Instanceof {
	public static void main(String[] args){

		Object obj = "Ola Mundo!"; // Cria um objeto generico e põe uma String

		// Instanceof verificar se um objeto pertence a um tipo específico
		if(obj instanceof String)
			System.out.println(obj); // Saida: Ola Mundo!

	}
}
