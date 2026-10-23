import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
	public static void main(String[] args){

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		System.out.println(livros.peek());	
		System.out.println(livros.element());

		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		// System.out.println(livros.remove());

		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
	}
}
