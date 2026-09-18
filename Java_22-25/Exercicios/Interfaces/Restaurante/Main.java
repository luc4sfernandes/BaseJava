interface PedidoRestaurante {
	void adicionarItem(String item, double preco);
	void calcularTotal(double total);
}

class Pedido implements PedidoRestaurante {
	public void adicionarItem(String item, double preco){
		System.out.printf("Pedido: %s\nPreço: %.2f\n", item, preco);
	} 

	public void calcularTotal(double total){
		System.out.printf("Total: %.2f\n", total);
	}
}

public class Main {
	public static void main(String[] args){
		Pedido prato = new Pedido();

		prato.adicionarItem("Arroz", 4.76);
		prato.calcularTotal(54.23);
	}
}
