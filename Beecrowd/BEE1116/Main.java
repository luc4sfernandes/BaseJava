import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		int contagem = entrada.nextInt();

		for(int i = 0; i < contagem; i++){
			double numerador = entrada.nextInt();
			double denominador = entrada.nextInt();

			if(denominador == 0)
				System.out.println("divisao impossivel");
			else
				System.out.printf("%.1f\n", numerador / denominador);	
		}
    }
}
