public class Temperatura {
    public static void main(String[] args){

        System.out.println("=== Calculadora de Temperatura ===\n");
        boolean erro = false;

        do {
            System.out.println("1 - Celsius     --> Fahrenheit");
            System.out.println("2 - Fahrenheit  --> Celsius");
            System.out.println("3 - Celsius     --> Kelvin");
            System.out.println("4 - Kelvin      --> Celsius");

            String texto = System.console().readLine("\nEscolha uma opcao: ");
            int numero = Integer.parseInt(texto);

            if(numero > 4 || numero < 1){
                System.out.println("\nOpcao invalida! Escolha uma opcao disponivel.\n");
                erro = true;
            } else {
                switch(numero){
                    case 1 -> {
                        String txt = System.console().readLine("\nCelsius: ");
                        double celsius = Double.parseDouble(txt);
                        double resultado = (celsius * 9/5.0) + 32;
                        System.out.println("Resultado --> Fahrenheit: " + resultado + "\n");
                    }
                    case 2 -> {
                        String txt = System.console().readLine("\nFahrenheit: ");
                        double fahrenheit = Double.parseDouble(txt);
                        double resultado = (fahrenheit - 32) * 5/9.0;
                        System.out.println("Resultado --> Celsius: " + resultado + "\n");
                    }
                    case 3 -> {
                        String txt = System.console().readLine("\nCelsius: ");
                        double celsius = Double.parseDouble(txt);
                        double resultado = celsius + 273.15;
                        System.out.println("Resultado --> Kelvin: " + resultado + "\n");
                    }
                    case 4 -> {
                        String txt = System.console().readLine("\nKelvin: "); // corrigido: era "Celsius"
                        double kelvin = Double.parseDouble(txt);
                        double resultado = kelvin - 273.15;
                        System.out.println("Resultado --> Celsius: " + resultado + "\n");
                    }
                }
                erro = false;
            }

        } while(erro);

    }
}
