interface ExemploInterfaceEspecial {
    // Método abstrato
    void metodoAbstrato();

    // Método default
    default void metodoDefault() {
        System.out.println("Este é um método default na interface.");
    }

    // Método static
    static void metodoStatic() {
        System.out.println("Este é um método static na interface.");
    }
}

class TestInterfaceEspecial implements ExemploInterfaceEspecial {

    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato.");
}

    public static void main(String[] args) {
        TestInterfaceEspecial exemplo = new TestInterfaceEspecial();

        exemplo.metodoAbstrato();
        exemplo.metodoDefault();
        ExemploInterfaceEspecial.metodoStatic();
    }
}
