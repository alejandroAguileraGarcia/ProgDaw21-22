import paquetes.Ejercicios01_14;

public class Ejercicio15 {
  public static void main(String[] args) throws Exception {

    int menor = 1;
    int mayor = 1000;
  
    if (!Ejercicios01_14.esPrimo(menor)) {
      menor = Ejercicios01_14.siguientePrimo(menor);
    }

    while (menor <= mayor) {
      System.out.println(menor);

      menor = Ejercicios01_14.siguientePrimo(menor);
    }

  }
}
