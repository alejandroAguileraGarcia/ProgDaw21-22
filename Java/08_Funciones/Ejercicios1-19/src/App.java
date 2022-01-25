import paquetes.Ejercicios20_28;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("Introduce un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());

        if (esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }
    }

    public static boolean esPrimo (int numero) {
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                esPrimo = false;
            }   
        }
    
        return esPrimo;
    }
}
