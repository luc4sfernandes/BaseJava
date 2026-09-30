import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args){
		Map<String, Integer> mapa = new HashMap<>();

		mapa.put("Java", 20);
		mapa.put("Python", 10);
		mapa.put("C++", 15);

		System.out.println("Contém o 'Java'? " + mapa.containsKey("Java"));
		System.out.println("Valor associado a 'Java': " + mapa.get("Java"));

		System.out.println(mapa);
		mapa.remove("Python");
		System.out.println(mapa);

		mapa.clear();
		System.out.println(mapa);
	}
}
