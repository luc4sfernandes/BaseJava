interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}

// Multiplas interfaces
abstract class ClasseExemplo implements Interface1, Interface2 { 
    public void metodo1() {
        System.out.println("Método 1");
    }

    public void metodo2() {
        System.out.println("Método 2");
    }
}

public class TestInterfaceMultipla extends ClasseExemplo { 
    public static void main(String[] args) {
		TestInterfaceMultipla test = new TestInterfaceMultipla();

		test.metodo1();
		test.metodo2();
    }
}
