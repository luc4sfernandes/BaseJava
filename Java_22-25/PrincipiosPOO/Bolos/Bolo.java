public class Bolo {

	int quantidadeAcucar;

	public static void main(String[] args){

		Bolo boloDeChocolate = new Bolo();

		boloDeChocolate.quantidadeAcucar = 200;

		Bolo boloDeBaunilia = new Bolo();

		boloDeBaunilia.quantidadeAcucar = 150;

		System.out.println("Quantidade de açúcar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);

		System.out.println("Quantidade de açúcar no baunilia de chocolate: " + boloDeBaunilia.quantidadeAcucar);
	}
}
