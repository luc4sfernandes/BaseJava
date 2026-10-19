public class Inferencias {
	public static void main(String[] args) {

		double a = 4.5; // Declaração da variavel de forma explicita
		System.out.println(a);

		var b = 4.5; // Serve para inferir o tipo da variável em tempo de compilação com base no valor atribuído
		System.out.println(b);

		var c = "Texto"; // Declaração da variavel de forma inplicita
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);

		// C --> double c = 21; | Erro!!! tanto como java não pode ocorrer mistura de tipos, mais ele força a voce dizer o tipo da variavel independe do contexto
		// Java --> var c = 21; | Não pode!!! Apos inferir a variavel, as variavel java sem sempre de 1 TIPO e nunca vai mudar!!!
		// Python --> c = 21 | Pode!!! O Python permite essas mudanças

		double d; // Variável foi declarada
		d = 123.65; // Variavel foi inicializada
		System.out.println(d); // usada!!!

		// var e; --> var serve apenas para o compilador inferir (adivinhar) o tipo com base no valor inicial atribuído à variável, e não usando o nome do tipo diretamente como valor.
		// e = 123.45;

		var e = 123.45;
		System.out.println(e);

		var f = 12; // Valor inteiro
		// f = 12.0; --> Um valor inteiro não consegue armazenar casas decimais
		System.out.println(f);

		var g = 12.9;
		g = 13; // Mais float ou double consegue armazenar numeros inteiros
		System.out.println(g);

	}
}
