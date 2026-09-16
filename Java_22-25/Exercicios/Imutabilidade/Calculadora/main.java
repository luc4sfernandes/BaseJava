class Calculadora {
	final public int somar(int a, int b){
		return a + b;
	}
}

public class main {
	public static void main(String[] args){
	
		Calculadora calculadora = new Calculadora();

		System.out.println(calculadora.somar(21, 32));		
	}
}
