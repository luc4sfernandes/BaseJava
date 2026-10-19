public class inferencia {
	public static void main(String[] args){

		double a = 4.5; // Tipo ponto flutuante de precisão dupla
		System.out.println(a);

		// double --> int: Erro
		a = 12; // Tem como declarar "tipos" int no float ou duble
		System.out.println("int --> double: " + a);

		var b = 4.5; // Vai inferir pelo tipo da variavel declarada
		System.out.println("Variavel usando inferencia --> " + b);

		var c = "Texto"; // // Vai inferir pelo String da variavel declarada 
		System.out.println("Variavel usando inferencia --> " + c);

		c = "Outro texto"; // Não a problema alterar a variavel
		System.out.println("Alterando a variavel --> " + c);

		// As variaveis em java sempre são de UM TIPO, esse tipo nunca vai mudar
		// c = 4.5; --> Erro

		double d; // Declarei a variável
		d = 123.65; // Inicializei

		System.out.println(d); // Usada! 

		// var e; --> Erro | Tem que inicializar, Partir da incialização que java Infere 
		// e = 123.45; 

		var e = 123.45;
		System.out.println(e);
		
	}
}
