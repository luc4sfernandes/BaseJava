import java.util.Map;
import java.util.HashMap;

public class Produto{
	public static void main(String[] args){
		Map<String, Integer> produto = new HashMap<>();

		produto.put("Celular", 29);
		produto.put("PS5", 7);
		produto.put("Geladeira", 5);

		System.out.println("Estoque do 'Celular': " + produto.get("Celular"));
		System.out.println("Estoque do 'PS5': " + produto.get("PS5"));
		System.out.println("Estoque da 'Geladeira': " + produto.get("Geladeira"));
		System.out.println("Estoque total atual: " + produto);

		produto.remove("Celular");
		System.out.println("Estoque apos remoção: " + produto);
	}
}
