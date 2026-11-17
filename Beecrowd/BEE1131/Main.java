// - Esquerdo --> Inter || Direito --> Gremino
// Quantos grenais - Vitorias do inter - Vitorias do gremio - Quantos empates

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner entrada = new Scanner(System.in);
		int vitoriasInter = 0, vitoriasGremio = 0, empates = 0, i = -1, grenais = 0;

    	 do {
    	 	int interGols = entrada.nextInt();
    	 	int gremioGols = entrada.nextInt();

    	 	if(interGols > gremioGols){
    	 		vitoriasInter++;
    	 	}

    	 	if(interGols < gremioGols){
    	 		vitoriasGremio++;
    	 	}

    	 	if(interGols == gremioGols){
    	 		empates++;
    	 	}
    	 	
			grenais++;
    	 	System.out.println("Novo grenal (1-sim 2-nao)");
    	 	i = entrada.nextInt();

    	 } while(i != 2);

    	 System.out.printf("%d grenais\n", grenais);
    	 System.out.printf("Inter:%d\n", vitoriasInter);
    	 System.out.printf("Gremio:%d\n", vitoriasGremio);
    	 System.out.printf("Empates:%d\n", empates);

			if(vitoriasInter > vitoriasGremio){
    	 		System.out.println("Inter venceu mais");
    	 	}

    	 	if(vitoriasInter < vitoriasGremio){
    	 		System.out.println("Gremio venceu mais");
    	 	}

    	 	if(vitoriasInter == vitoriasGremio){
    	 		System.out.println("Nao houve vencedo");
    	 	}
    }
 
}
