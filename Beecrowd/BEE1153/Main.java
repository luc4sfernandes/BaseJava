import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 		Scanner entrada = new Scanner(System.in);
 		int resultado = 1, num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
		      resultado *= i;
		 }

 		System.out.println(resultado);
    }
 
}
