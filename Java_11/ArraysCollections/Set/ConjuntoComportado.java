import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args){

		Set<String> lista = new HashSet<>();

		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");

		System.out.println(lista);

		for(String nome : lista)
			System.out.println(nome);

		System.out.println();

		Set<String> listaOrdenada = new TreeSet<>(); // Deixa o conjuto ordenado, usando o 'Tree'

		listaOrdenada.add("Ana");
		listaOrdenada.add("Carlos");
		listaOrdenada.add("Luca");
		listaOrdenada.add("Pedro");

		System.out.println(lista);

		for(String nome : listaOrdenada)
			System.out.println(nome);
	}
}
