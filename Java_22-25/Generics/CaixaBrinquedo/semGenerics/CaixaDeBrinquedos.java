class CaixaDeBrinquedos {

    private Object coisaNaCaixa;

    public void guardar(Object coisa) {
        this.coisaNaCaixa = coisa;
    }

    public Object pegar() {
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        // Criando uma caixa para guardar carrinhos
        CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
        caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels"));

        // Criando uma caixa para guardar bonecas
        CaixaDeBrinquedos caixaDeBonecas = new CaixaDeBrinquedos();
        caixaDeBonecas.guardar(new Boneca("Barbie"));

        // Verificamos o tipo do objeto antes de fazer o cast
        if (caixaDeCarrinhos.pegar() instanceof Carrinho) {
            Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
            System.out.println(carrinho.getModelo()); // Imprime: Hot Wheels
        }

        if (caixaDeBonecas.pegar() instanceof Boneca) {
            Boneca boneca = (Boneca) caixaDeBonecas.pegar();
            System.out.println(boneca.getNome()); // Imprime: Barbie
        }
    }
}
