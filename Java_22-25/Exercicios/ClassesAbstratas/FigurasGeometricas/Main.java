abstract class FiguraGeometrica {
	abstract int calcularArea(int base, int altura);
	abstract int calcularPerimetro(int base, int altura);
}

class Retangulo extends FiguraGeometrica {
	public int calcularArea(int base, int altura){
		return base * altura;
	}

	public int calcularPerimetro(int base, int altura){
		return (base * 2) + (altura * 2);
	}
}

public class Main {
	public static void main(String[] args){
		Retangulo retangulo = new Retangulo();

		System.out.println("Aréa do Retangulo: " + retangulo.calcularArea(10, 10));
		System.out.println("Perimetro do Retangulo: " + retangulo.calcularPerimetro(10, 10));
	}
}
