package classe.Desafio;

public class Data {
    // Atributos
    int dia;
    int mes;
    int ano;

    // Metodos contrutores
    Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Metodos
    String dataFormatada(){
        String textoFormatado = String.format("%d/%d/%d", dia, mes, ano);
        return textoFormatado;
    }

}
