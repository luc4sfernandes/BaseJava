import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<String> filmes = new ArrayList<>();

		filmes.add("Homen de ferro");
		filmes.add("Super Man");
		filmes.add("Kimetsu");

		System.out.println("Catalogo dos filmes: " + filmes);
		System.out.println("O filme 'Kimetsu' está no catalogo ? " + filmes.contains("Kimetsu"));
	}
}
