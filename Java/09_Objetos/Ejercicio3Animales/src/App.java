import paquetes.Fraccion;

public class App {
    public static void main(String[] args) throws Exception {
        
        Fraccion f1 = new Fraccion (1, 4);
        Fraccion f2 = new Fraccion (4, 1);

        f1.divide(f2);

        System.out.println(f1);
    }
}
