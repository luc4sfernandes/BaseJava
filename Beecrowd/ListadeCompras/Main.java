import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        if (!entrada.hasNextLine()) return;
        int num = Integer.parseInt(entrada.nextLine().trim());
        
        for (int i = 0; i < num; i++) {
            String texto = entrada.nextLine();
            
            // TreeSet remove duplicadas automaticamente e ordena alfabeticamente
            Set<String> lista = new TreeSet<>(Arrays.asList(texto.split("\\s+")));
            
            // String.join une os elementos com espaço e System.out.println quebra a linha no final
            System.out.println(String.join(" ", lista));
        }
    }
}
