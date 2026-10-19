public class SwitchSemBreak {
	public static void main(String[] args){
		String faixa = "marrom";

		switch(faixa.toLowerCase()){
			case "preta":
				System.out.println("Sei o Bassai-Dai...");
			case "marrom":
				System.out.println("Sei o Tekki Shodan");
			case "roxa":
				System.out.println("Sei o Heian Yodan");
			case "laranja":
				System.out.println("Sei o Hian Sandan");
			case "vermelha":
				System.out.println("Sei o Hian Nidan");
			case "amarela":
				System.out.println("Sei o Heian Shodan");
				break;
			default:
				System.out.println("Não sei nada");						
		}
	}
}
