import paquete.Tiempo;

public class App {
    public static void main(String[] args) throws Exception {
        Tiempo t1 = new Tiempo (1, 30, 40);
        Tiempo t2 = new Tiempo (0, 40, 50);

        t1.resta(t2);

        System.out.println(t1);
    }
}
