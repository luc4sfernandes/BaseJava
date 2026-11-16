import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner entrada = new Scanner(System.in);
		double i = 0, num = 0, media = 0;
		
    	do {
    		num = entrada.nextDouble();

    		if(num > 10 || num < 0)
    			System.out.println("nota invalida");
    		else {
    			media += num;
    			i++;
    		}	
    		
    	} while(i != 2);

    	System.out.printf("media: %.2f\n", media / 2);
    }
}
