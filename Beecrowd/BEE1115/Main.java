import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		while(true){
			int x = entrada.nextInt();
			int y = entrada.nextInt();

			if(x == 0 || y == 0) { break; }

			if(x > 0 && y > 0)
				System.out.println("primeiro");

			if(x > 0 && y < 0)
				System.out.println("quarto");

			if(x < 0 && y > 0)
				System.out.println("segundo");

			if(x < 0 && y < 0)
				System.out.println("terceiro");
													
		}
    }
 
}
