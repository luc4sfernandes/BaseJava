// OPERADOR TERNARIO
// Muito util para simplificar codigo, uma 'substuição' de um if-else

public class OperadorTernario {

	public static void main(String[] args){	

		int numero = 10; // Declaração 

		// Operador ternario --> Expressão ? Verdadeiro : Falso;
		String resultado = (numero % 2 == 0) ? "Par" : "Impar";
		System.out.println(resultado);
	}
}
