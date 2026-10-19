public class ConversaoTipoPrimitivoNumetico {
	public static void main(String[] args){

		double a = 1; // Conversão implicita | int --> double
		System.out.println(a);

		// Solução simples era por 'F' no final do numero
		float b = (float) 1.12345; // Conversão explicita (CAST)
		System.out.println(b);

		int c = 127; // Maximo da capacidade do byte
		byte d = (byte) c; // Pode haver perda de informação pondo um valor primitivo num menos que da sua origem
		System.out.println(d);

		double e = 1.99999;
		int f = (int) e; // Vai haver perda de informação
		System.out.println(f);
	}
}
