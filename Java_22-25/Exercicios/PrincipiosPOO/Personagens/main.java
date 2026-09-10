public class main {
	public static void main(String[] args){
		Personagem personagem1 = new Personagem("Goku Base", 9000);

		personagem1.info();
		personagem1.alterarNivelDePoder(1000); 

		personagem1.alterarNome(personagem1, "Goku Base");
		personagem1.alterarNivelDePoder(-4352);
		personagem1.info();
	}
}
