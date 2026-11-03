import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.println("// Calculadora de Temperatura //\n");
		boolean erro = false;

		do {
			System.out.printf("1*Celsius --> Fahrenheit\n2* Fahrenheit --> Celsius\n3*Celsius --> Kelvin\n4*Kelvin --> Celsius\n");
			System.out.print("Escolha uma opção: ");
			int numero = Integer.parseInt(entrada.nextLine());

			if(numero > 4 || numero < 1){
				System.out.println("\nOpção invalida!!! Escolha uma opção disponivel\n");
				erro = true;
			} else {
				switch(numero){
					case 1 -> {
						System.out.print("\n\nCelsius: ");
						double celsius = Double.parseDouble(entrada.nextLine());
						double resultado = (celsius * 9/5.0) + 32;
						System.out.println("Celsius --> Fahrenheit: " + resultado);
					}
					case 2 -> {
						System.out.print("\n\nFahrenheit: ");
						double fahrenheit = Double.parseDouble(entrada.nextLine());
						double resultado = (fahrenheit - 32) * 5/9.0;
						System.out.println("Fahrenheit --> Celsius: " + resultado);
					}
					case 3 -> {
						System.out.print("\nCelsius: ");
						double celsius = Double.parseDouble(entrada.nextLine());
						double resultado = celsius + 273.15;
						System.out.println("Celsius --> Kelvin: " + resultado);
					}
					case 4 -> {
						System.out.print("\nKelvin: ");
						double kelvin = Double.parseDouble(entrada.nextLine());
						double resultado = kelvin - 273.15;
						System.out.println("Kelvin --> Celsius: " + resultado);
					}
				}
				erro = false;
			}

		} while(erro);

		entrada.close();
	}
}
