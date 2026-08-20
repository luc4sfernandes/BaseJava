/* 
Domingo --> 1
Segunda --> 2
...
Sabado --> 7	

Entrada: Nome do dia da semana
Saida: Numero associado ao dia
*/
import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		String diaSemana = entrada.nextLine();
		// System.out.println(diaSemana.equals("domingo"));

		if(diaSemana.equals("domingo"))
			System.out.println("1");
		else if(diaSemana.equals("segunda"))
			System.out.println("2");
		else if(diaSemana.equals("terça"))
			System.out.println("3");		 
		else if(diaSemana.equals("quarta"))
			System.out.println("4");
		else if(diaSemana.equals("quinta"))	
			System.out.println("5");
		else if(diaSemana.equals("sexta"))
			System.out.println("6");
		else if(diaSemana.equals("sabado"))
			System.out.println("7");
		else 
			System.out.println("Dia invalido!!!");							
			
		entrada.close();
	}
}
