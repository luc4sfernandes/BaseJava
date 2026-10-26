import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 		Scanner entrada = new Scanner(System.in);

 		while(true){
 			int i = entrada.nextInt();
 			int j = entrada.nextInt();

 			if(i == j) { break; }

 			if(i > j)
 				System.out.println("Decrescente");
 			else
 				System.out.println("Crescente");	
 		}
    }
}
