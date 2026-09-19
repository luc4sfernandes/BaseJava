abstract class Loja {
	String cnpj;
	String razaoSocial;
	boolean aberta;

	public Loja(String cnpj, String razaoSocial, boolean aberta){
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = aberta;
	}

	 abstract boolean abrir();
	 abstract boolean fechar();
}

class LojaComercial extends Loja{

	LojaComercial(String cnpj, String razaoSocial, boolean aberta){
		super(cnpj, razaoSocial, aberta);
	}

	public boolean abrir(){
		aberta = true;
		return aberta;
	}

	public boolean fechar(){
		aberta = false;
		return aberta;
	}

	public String infoAberta(){
		if(aberta == true)
			return "Aberta";
		else
			return "Fechada";	
	}		
}

public class Main {
	public static void main(String[] args){
		LojaComercial loja = new LojaComercial("00.000.000/0001-00", "Nova Era Serviços Digitais Ltda", true);

		System.out.printf("Nome da Loja: %s\nCNPJ: %s\nA loja está %s\n", loja.cnpj, loja.razaoSocial, loja.infoAberta());
		loja.fechar();
		System.out.println(loja.infoAberta());
	}
}
