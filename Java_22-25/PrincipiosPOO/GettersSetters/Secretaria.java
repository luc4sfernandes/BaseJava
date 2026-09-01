public class Secretaria {
	public static void main(String[] args){

		Alunos aluno = new Alunos("Lucas");
		System.out.println("Nome inicial: " + aluno.getnome());
		
		aluno.setnome("Lucas Fernandes Da Cunha");
		System.out.println("Nome final: " + aluno.getnome());
	}
}
