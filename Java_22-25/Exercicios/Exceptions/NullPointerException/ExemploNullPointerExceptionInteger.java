public class ExemploNullPointerExceptionInteger {
	static Integer numero = null;

	public static void main(String[] args){

		try {
			System.out.println(numero.toString());

		} catch(NullPointerException e) {
			System.out.println("ERRO - " + e.getMessage());
		}
	}
}
