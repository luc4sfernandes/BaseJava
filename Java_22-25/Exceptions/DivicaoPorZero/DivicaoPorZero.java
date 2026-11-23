public class DivicaoPorZero {
	public static void main(String[] args){
		int notaTotalAlunos = 100;
		int alunos = 0;

		try {
			int media = notaTotalAlunos / alunos;

		} catch(ArithmeticException _) { // Utiliza '_' para usar uma sem nome.

			System.out.println("Problema: Divisão por Zero!");
		} finally {
			System.out.println("Sofware Terminado!");
		}
	}
}
