class ExemploDepreciado {
	@Deprecated
	public void metodoDepreciado() {}
}

@SuppressWarnings("deprecation") // Ira ignorar o aviso do 'Deprecated'
public class Main {
	public static void main(String[] args){
		ExemploDepreciado exemplo = new ExemploDepreciado();

		exemplo.metodoDepreciado();
	}
}
