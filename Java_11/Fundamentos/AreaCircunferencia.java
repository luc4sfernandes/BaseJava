public class AreaCircunferencia {

	public static void main(String[] args){

		final double PI = 3.14159; // Tranformou numa constante, ela não pode ser alterada em nenhuma parte do código!!!
		double raio = 3.4;
		double area = PI * raio * raio;

		System.out.println(area);

		raio = 10;
		area = PI * raio * raio;
		System.out.println("Àrea = " + area + "m2.");
	}
}
