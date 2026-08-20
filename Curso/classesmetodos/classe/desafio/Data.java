package classesmetodos.classe.desafio;

public class Data {
    // Atributos
    public int dia;
    public int mes;
    int ano;
    public char[] dataFormatada;

    // Metodos contrutores
    Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(int dia, int mes, int ano){
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
