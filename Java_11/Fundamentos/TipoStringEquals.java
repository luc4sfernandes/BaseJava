import java.util.Scanner;

public class TipoStringsEquals {
	public static void main(String[] args){

		// Grande moral do codigo é... quando for comparar strings, use .equals()
		Scanner entrada = new Scanner(System.in);
		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s); // Jeito errado
		System.out.println("2".equals(s)); // Jeito certo de comparar strings, ele vai comparar os conteudos e dar false ou true

		String s1 = entrada.next(); // .next() ele ja tira os espaços em branco, o nextLine não faz isso!!!
		System.out.println("2" == s1.trim()); // .trim() --> Retira todos os espaços em branco
		System.out.println("2".equals(s1.trim()));


		entrada.close();
	}
}
