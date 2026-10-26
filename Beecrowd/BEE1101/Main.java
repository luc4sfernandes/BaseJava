import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		while(true){
			int num = 0;

			int i = entrada.nextInt();
			int j = entrada.nextInt();

			if(i <= 0 || j <= 0){ break; }

			if(j > i){
				int temp = i;
				i = j;
				j = temp;
			}
			
			for(;i >= j; j++){

				System.out.printf("%d ", j);
				num += j;

				if(j == i){
					System.out.printf("Sum=%d\n", num);
				}	
			}	
		}
    }
}
