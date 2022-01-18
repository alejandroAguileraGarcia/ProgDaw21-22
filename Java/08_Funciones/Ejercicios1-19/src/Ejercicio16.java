import paquetes.Ejercicios01_14;

public class Ejercicio16 {
  public static void main(String[] args) throws Exception {

    int menor = 1;
    int mayor = 99999;
  
    for (int i = menor; i <= mayor; i++) {
      if (Ejercicios01_14.esCapicua(i)) System.out.println(i);
    }

  }
}
