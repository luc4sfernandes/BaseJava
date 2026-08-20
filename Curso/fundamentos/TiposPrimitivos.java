public class TiposPrimitivos {
	public static void main(String[] args){
		// Informações do funcionario

		// Tipos numéricos interios
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;

		// Em Java, todo número inteiro digitado diretamente no código (literal) é int por padrão.
		// long pontos = 3000000000; --> Erro de compilação!

		long pontosAcumulados = 1_234_845_223L; 
	/*	│                            │       │
		│                            │       └─ "L": Avisa que o número é do tipo Long
	    │                            └─ "_": Apenas visual (o Java lê como 1234845223)
        └─ Tipo da variável capaz de guardar números gigantescos
	*/	

		// Tipos numéricos reais
		float salario = 11_445.44F; // Ele não analisar o valor mais o tipo
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false; // true

		// Tipo caractere
		char status = 'A'; // Ativo
		// char tebelaUnicode = '\u0010'; --> Representação na tebela unicode

		// Dias de empresa
		System.out.println("Dias na empresa: " + anosDeEmpresa * 365);

		// Número de viagens
		System.out.println("Numeros de viagens: " + numeroDeVoos / 2);

		// Pontos por real
		System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias ? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
