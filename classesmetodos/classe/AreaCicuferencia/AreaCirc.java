public class AreaCirc {
    double raio;
    final static double PI = 3.14; // Definiu uma constante estatica
    
    AreaCirc(double raio){
        this.raio = raio;
    }

    double area(){
        return Math.pow(raio, 2) * PI;
    }

    static double area(double raio){
        return Math.pow(raio, 2) * PI;
    }
}
