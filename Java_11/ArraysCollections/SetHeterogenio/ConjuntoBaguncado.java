import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args){

		HashSet conjunto = new HashSet(); // Sem declarar um 'Tipo' padrão

		conjunto.add(1.2); // (Tipo primitivo) --> (Objeto) | double --> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("teste"); // Não havera repetição ja que é 'teste' com 'T' minusculo
		System.out.println("Tamanho é " + conjunto.size());

		conjunto.remove("teste");
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x')); // Verifica se um objeto esta no conjunto

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);

		// conjunto.addAll(nums); // União entre dois conjuntos
		System.out.println(conjunto);

		conjunto.retainAll(nums); // Interseção entre dois conjuntos
		System.out.println(conjunto);

		conjunto.clear();
		System.out.println(conjunto);
	}
}
