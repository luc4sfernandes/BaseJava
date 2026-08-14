public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        // a1.pi = 10000000;

       //  AreaCirc a2 = new AreaCirc(5);
        // a2.pi = 0;
        
        // AreaCirc.PI = 3.1415; 

        System.out.println(AreaCirc.area(5));
        System.out.println(a1.area());
        System.out.println(AreaCirc.PI);
        System.out.println("Verção da API do java: " + Math.PI);
    }
}