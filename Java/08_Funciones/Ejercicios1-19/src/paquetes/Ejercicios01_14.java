package paquetes;

public class Ejercicios01_14 {
  
  public static boolean esCapicua (int num) {
    return num == voltea(num);
  }

  public static boolean esPrimo (int num) {
    
    boolean esPrimo = true;

    if (num <= 1) {
      esPrimo = false;
    } else {
      int divisores = 0;
      
      for (int i = 1; i <= num; i++) {
        if (num % i == 0) divisores++;
      }

      if (divisores > 2) esPrimo = false;
    }

    return esPrimo;
  }

  public static int siguientePrimo (int num) {

    do {
      num++;
    } while (!esPrimo(num));

    return num;
  }

  public static int potencia (int base, int exponente) {
    return (int) Math.pow(base, exponente);
  }

  public static int digitos (int num) {
    int digitos = 0;

    while (num > 0) {
      digitos++;
      num /= 10;
    }

    return digitos;
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

  public static int digitoN (int num, int n) {
    return num / potencia (10, digitos (num) - n - 1) % 10;
  }

  public static int posicionDeDigito (int num, int digito) {
    
    for (int i = 0; i < digitos(num); i++) {
      if (digitoN(num, i) == digito) return i;
    }

    return -1;
  }

  public static int quitarPorDetras (int num, int digitosquitar) {
    return num / potencia(10, digitosquitar);
  }

  public static int quitarPorDelante (int num, int digitosquitar) {
    return num % potencia(10, digitos(num) - digitosquitar);
  }

  public static int pegaPorDetras (int num, int digito) {
    return num * 10 + digito;
  }

  public static int pegaPorDelante (int num, int digito) {
    return num + digito * potencia(10, digitos(num));
  }

  public static int trozoDeNumero (int num, int posicionInicial, int posicionFinal) {

    int numeroFinal = quitarPorDelante(num, posicionInicial);

    numeroFinal = quitarPorDetras (numeroFinal, digitos(num) - posicionFinal - 1);

    return numeroFinal;
  }

  public static int juntaNumeros (int num1, int num2) {
    return num1 * potencia (10, digitos(num2)) + num2;
  }
} 