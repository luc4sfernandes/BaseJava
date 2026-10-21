import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args){
		Queue<String> fila = new LinkedList<>();

		// Offer e Add --> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia.
		fila.add("Ana"); // retorna false
		fila.offer("Bia");	// Lança uma execeção
		fila.add("Carlos");	
		fila.offer("Daniel");	
		fila.add("Rafaela");
		fila.offer("Gui");		

		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // Lança uma execeção

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contens();
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Lança uma execeção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}
}
