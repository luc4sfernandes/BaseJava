public class NotacaoPonto {
	public static void main(String[] args){

		String s = "Bom dia X";
		s = s.toUpperCase(); // Converte todas as letras para MAIUSCULA
		System.out.println(s);

		s = s.replace("X", "Senhora"); // Ele faz substuição do 1 termo pelo 2
		System.out.println(s);

		s = s.concat("!!!"); // Vai concatenar uma String na outra
		System.out.println(s);

		System.out.println("Leo".toUpperCase()); // Terei mesmas funcionalidas de um objeto

		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);

		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
