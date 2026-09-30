import java.util.Set;
import java.util.HashSet;

public class SetExercise {
	public static void main(String[] args){
		Set<Integer> conjunto = new HashSet<>();

		conjunto.add((int) (Math.random() * 10) + 1);
		conjunto.add((int) (Math.random() * 10) + 1);
		conjunto.add((int) (Math.random() * 10) + 1);
		conjunto.add((int) (Math.random() * 10) + 1);

		System.out.println("Este número '5' está no conjunto ? " + conjunto.contains(5));
		System.out.println(conjunto);
	}
}
