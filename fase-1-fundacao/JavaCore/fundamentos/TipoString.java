package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0)); // .charAt(index) --> Mostra o conteudo referenciado no indexe posto

        String s = "Boa tarde"; // String e um objeto imutavel, quer dizer que não vai conseguir mudar o valor inicial
        s = s.toUpperCase(); // Mesmo "Modificando" a string voce nao esta modificando o valor detro armazenado na letra s
        // s = "Bom dia"
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.toLowerCase().startsWith("boa")); // Corrigido para "boa" pois o toLowerCase() deixou tudo minusculo
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length()); // Retorna a quantidade de caracteres nesse contexto
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        // Uso do 'var' para inferência de tipos (Java 10+)
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        // Concatenação tradicional com quebras de linha (\n)
        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade + "\nSalario: " + salario + "\n";
        System.out.println(maisUmaFrase);

        // Print formatado (printf) - %s para String, %d para inteiros, %.2f para float/double com 2 casas decimais
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n",
                nome, sobrenome, idade, salario);

        // String.format - Funciona igual ao printf, mas em vez de printar na tela, armazena o resultado em uma variável
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.\n",
                nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
