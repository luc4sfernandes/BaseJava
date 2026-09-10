public class SalaDeAula {
	static int totalAlunos;

	SalaDeAula(int totalAlunosInit){
		totalAlunos = totalAlunosInit;
	}

	 public static void acrecimoAluno(int acrecimo){
		totalAlunos += acrecimo;
	}

	public static int info(){
		return totalAlunos;
	}

}
