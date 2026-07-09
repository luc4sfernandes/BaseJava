public class Temperatura {
	public static void main(String[] args){

		System.out.println("// Calculadora de Temperatura //\n");
		boolean erro = false;

		do {
			System.out.printf("1*Celsius --> Fahrenheit\n2* Fahrenheit --> Celsius\n3*Celsius --> Kelvin\n4*Kelvin --> Celsius\n");
			String texto = System.console().readLine("Escolha uma opção: "); // Coleta a resposta do usuario, em string...
			int numero = Integer.parseInt(texto); // Converte de string para numero inteiro

			// System.out.println(numero);

			if(numero > 4 || numero < 1){
				System.out.println("\nOpção invalida!!! Escolha uma opção disponivel\n");
				erro = true;
			} else {
				switch(numero){
					case 1 -> {
						String txt = System.console().readLine("\n\nCelsius: "); // Coleta a resposta do usuario, em string...
						double Celsius = Integer.parseInt(txt); // Converte de string para numero double
						double resultado = (Celsius * 9/5.0) + 32;
						System.out.println("Celsius --> Fahrenheit: " + resultado);
					}
					case 2 -> {
						String txt = System.console().readLine("\n\nFahrenheit: "); // Coleta a resposta do usuario, em string...
						double Fahrenheit = Integer.parseInt(txt); // Converte de string para numero double
						double resultado = (Fahrenheit - 32) * 5/9.0;
						System.out.println("Fahrenheit --> Celsius: " + resultado);
					}
					case 3 -> {
						String txt = System.console().readLine("\nCelsius: "); // Coleta a resposta do usuario, em string...
						double Celsius = Integer.parseInt(txt); // Converte de string para numero double
						double resultado = Celsius + 273.15;
						System.out.println("Celsius --> Kelvin: " + resultado);
					}
					case 4 -> {
						String txt = System.console().readLine("\nCelsius: "); // Coleta a resposta do usuario, em string...
						double Kelvin = Integer.parseInt(txt); // Converte de string para numero double
						double resultado = Kelvin - 273.15;
						System.out.println("Kelvin --> Celsius: " + resultado);
					}
				}
				erro = false;
			}

		} while(erro);

	}
}
