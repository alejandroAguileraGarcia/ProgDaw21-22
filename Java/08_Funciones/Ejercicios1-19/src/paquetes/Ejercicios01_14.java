package paquetes;

public class Ejercicios01_14 {
  
  public static boolean esCapicua (int num) {
    if (num == voltea(num)) return true;
    else return false;

  }

  public static boolean esPrimo (int num) {
    
  }

  public static int voltea (int num) {
    int resultado = 0;

    while (num > 0) {
      resultado *= 10;
      resultado += (num % 10);
      num /= 10;

    }
    return resultado;
  }

}
