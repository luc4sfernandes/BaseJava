public class ArrayExercicio {

	static public int acessarElemento(int[] array, int indice){
		return array[indice];
	}

	public static void main(String[] args){
		int[] meuArray = {10, 20, 30, 40, 50};

		try {
			System.out.println(acessarElemento(meuArray, 7));

		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERRO - " + e.getMessage());
		}
	}
}
