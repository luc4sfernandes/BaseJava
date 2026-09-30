import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {
	public static void main(String[] args){
		List<String> lista = new ArrayList<>();

		lista.add("Java");
		lista.add("Python");
		lista.add("C++");

		System.out.println("Contém 'Java ?' " + lista.contains("Java"));

		List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
		lista.addAll(outraLista);

		System.out.println("Lista completa: " + lista);

		lista.remove("Python");

		System.out.println("Lista após remoção: " + lista);

		String elemento = lista.get(2);
		System.out.println("Elemento no índice 2: " + elemento);

		lista.clear();

		System.out.println(lista);
	}
}
