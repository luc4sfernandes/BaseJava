final class ExemploFinal {
    
    // Definição de Constante - uso de final
    final int CODIGO_FIXO = 10; // --> Padrão e letras maiusculas, separado com: _
    
    // Método final
    final void meuMetodo() {
        System.out.println("Este é um método final.");
    }
}

public class TestFinalKeyword {
    public static void main(String[] args) {
        ExemploFinal testFinal = new ExemploFinal();

        // testeFinal.CODIGO_FIXO = 33 --> ❌ ERRO DE COMPILAÇÃO! Não pode ser reatribuída.

        System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
        testFinal.meuMetodo();

    }
}
