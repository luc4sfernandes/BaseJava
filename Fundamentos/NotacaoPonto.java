public class NotacaoPonto {
	public static void main(String[] args){

		String s = "Bom dia X"; // Criação de uma string
		s = s.replace("X", "senhora"); // .replace(new, old) --> Subistuição dentro de uma variave
		s = s.toUpperCase(); // .toUpperCase() --> Deixa todas as letras maiusculas
		s = s.concat("!!!"); // s.concat(); --> Concatena dentro da variavel

		System.out.println(s);

		System.out.println("Leo".toUpperCase()); // Da para fazer a mesma coisa usando textos entre os ""

		String y = "Bom dia X".replace("X", "Gui").toLowerCase(); // .toLowerCase() --> Deixa todas as letras minusculas
		System.out.println(y);

		// Tipos primitivos não tem o operador "."

		int a = 3;
		// a. --> Não pode ter comportamentos atrelados aos tipos primitivos
		System.out.println(a);
	}
}
