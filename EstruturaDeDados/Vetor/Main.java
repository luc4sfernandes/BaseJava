import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Vetor vetor = new Vetor(2);

	
		vetor.adiciona("Lucas");
		vetor.adiciona("Pedro");
		vetor.adiciona("Extra");		

		for(String elemento : vetor.getElementos()){
			System.out.println(elemento);
		}
	}
}
