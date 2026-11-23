import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 		Scanner entrada = new Scanner(System.in);

 		int x = entrada.nextInt();
 		int y = entrada.nextInt();

 		if(x > y){
 			int temp = x;
 			x = y;
 			y = temp;
 		}

 		for(int i = x; i < y; i++){
 			if(i % 5 == 2 || i % 5 == 3)
 				if(i != 2)
 					System.out.println(i);
 		}
    }
 
}
