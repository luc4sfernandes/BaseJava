class SuperClasse {
	public void imprimir(){
		System.out.println("Classe Pai");
	}
}

class MinhaClasse extends SuperClasse {
	@Override // <-- Atenção!
	public void imprimir(){
		System.out.println("Classe Filha!");
	}
}

public class main {
	public static void main(String[] args){
		MinhaClasse classe = new MinhaClasse();
		classe.imprimir();
	}
}
