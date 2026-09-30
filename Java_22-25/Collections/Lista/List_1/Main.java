import java.util.*;

public class Main {
	public static void main(String[] args){
		// Criando uma lista de objetos tipo String
		List<String> nomes = new ArrayList<>();

		nomes.add("Lucas");
		nomes.add("Rafael");
		nomes.add("Guilherme");
		nomes.add("Rafael"); // Permite repetir mesmo elemento!

		System.out.println(nomes);
	}
}
