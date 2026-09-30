import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args){
		Set<String> conjunto = new HashSet<>();

		conjunto.add("Java");
		conjunto.add("Python");
		conjunto.add("C++");

		System.out.println(conjunto);

		conjunto.remove("C++");

		System.out.println(conjunto);
		System.out.println("Contem a String 'Java' ? " + conjunto.contains("Java"));

		conjunto.clear();
		System.out.println(conjunto);
	}
}
