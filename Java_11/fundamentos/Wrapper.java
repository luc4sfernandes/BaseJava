import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		// Wrapper --> Objeto de um tipo primitivo //

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next()); // Equivalente ao int | .parseInt() --> Tranforma string em inteiro
		Long l = 1000000L; // Necessario por um L no final para funcionar

		// Agora podemos usar ações nesses objetos primitivos //

		System.out.println(b.byteValue()); // Tranforma em byte
		System.out.println(s.toString()); // Trasnforma em String
		System.out.println(i * 3);
		System.out.println(l / 3);

		Float f = 123.10F; // Obrigatoriamente precisa por um 'F' no final
		System.out.println(f);

		Double d = 123.5678;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true"); // .parseBoolean() --> Tranforma string em booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Primeiro converte o booleano e stringe depois faz a opereção

		Character c = '#'; // Equivalente ao char
		System.out.println(c.toString());

		entrada.close();
	}
}
