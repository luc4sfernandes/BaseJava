package classe.Desafio;
import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Data d1 = new Data();

        // Data formatada padrão
        System.out.println(d1.dataFormatada());

        // Atribuir as informações da nova data
        System.out.print("Dia: ");
        d1.dia = entrada.nextInt();
        
        System.out.print("Mes: ");
        d1.mes = entrada.nextInt();
        
        System.out.print("Ano: ");
        d1.ano = entrada.nextInt();

        System.out.println(d1.dataFormatada());
    }
}
