public class SwitchCaseInitialization {
	public static void main(String[] args){
		String dia = "Ter.";

		// Vai incializar uma variavel, evitanto varios if-else
		String tipoDeDia = switch (dia){
			case "Seg.", "Ter.", "Qua.", "Sex." -> "Dia util";
			case "Sabado", "Domingo" -> "Fim de semana";
			default -> "Desconhecido";
		};

		System.out.println(tipoDeDia); // Dia util
	}
}
