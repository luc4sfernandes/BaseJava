public class SwitchCaseExpression {
	public static void main(String[] args){
		int day = 3;

		switch(day){
			case 1 -> System.out.println("Segunda");

			case 2 -> System.out.println("Terça");

			case 3 -> System.out.println("Quarta");

			// ...

			default -> System.out.println("Desconhecido");
			
		}
	}
}
