public class DivicaoPorZero {

	public static int calcularMedia(int notaTotal, int quantidadeAlunos) throws ArithmeticException {
		return notaTotal / quantidadeAlunos;
	}

	public static void main(String[] args) {
		int notaTotal = 50, quantidadeAlunos = 1;

		System.out.println(calcularMedia(notaTotal, quantidadeAlunos)); // Não obriga o try catch

		try {
			quantidadeAlunos = 0;
			System.out.println(calcularMedia(notaTotal, quantidadeAlunos));

		} catch(ArithmeticException a){
			System.out.println("Erro: Divisão por zero! " + a.getMessage());

		} finally {
			System.out.println("Sofware Encerrado");
		}
		
	}
}
