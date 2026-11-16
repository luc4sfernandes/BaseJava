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

			if(i == 2){
				int controle = 0;

				System.out.printf("media = %.2f\n", media / 2);
				media = 0;
				
				while(controle != 1){
					System.out.println("novo calculo (1-sim 2-nao)");
					int temp = entrada.nextInt();

					if(temp == 1){
						i = 0;
						controle = 1;	
					}

					if(temp == 2){
						controle = 1;	
					}
				}
			}
			
		} while(i != 2);

    }
}
