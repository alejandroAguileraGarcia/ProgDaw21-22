package paquetes;

public class Ejercicios20_28 {
  
  public static int [] generaArrayInt (int n, int min, int max) {
    int [] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      array [i] = (int) (Math.random() * (max - min) + min);
    }

    return array;
  }

  public static int minimoArrayInt (int[] arrayInt) {
    
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < arrayInt.length; i++) {
      if (arrayInt[i] < min) min = arrayInt[i];
    }

    return min;
  }

  public static int maximoArrayInt (int[] arrayInt) {
    
    int max = Integer.MIN_VALUE;
    
    for (int i = 0; i < arrayInt.length; i++) {
      if (arrayInt[i] > max) max = arrayInt[i];
    }

    return max;
  }

  public static double mediaArrayInt (int[] arrayInt) {
    
    double suma = 0;
    
    for (int i = 0; i < arrayInt.length; i++) suma += arrayInt[i];
    
    return suma / (double) arrayInt.length;
  }

  public static boolean estaEnArrayInt (int[] arrayInt, int n) {

    for (int i = 0; i < arrayInt.length; i++) {
      if (arrayInt[i] == n) return true;
    }

    return false;
  }

  public static int posicionEnArrayInt (int[] arrayInt, int n) {

    for (int i = 0; i < arrayInt.length; i++) {
      if (arrayInt[i] == n) return i;
    }

    return -1;
  }

  public static int [] volteaArrayInt (int[] arrayInt) {

    int [] voltea = new int[arrayInt.length];

    int j = arrayInt.length - 1;

    for (int i = 0; i < arrayInt.length; i++) voltea[i] = arrayInt[j--];
    
    return voltea;
  }

  public static int [] rotaDerechaArrayInt (int[] arrayInt, int n) {

    for (int i = 0; i < n; i++) {
      int nfinal = arrayInt[arrayInt.length - 1];

      for (int j = arrayInt.length - 1; j > 0; j--) {
        arrayInt[j] = arrayInt [j - 1];
      }

      arrayInt[0] = nfinal;
    }

    return arrayInt;
  }

  public static int [] rotaIzquierdaArrayInt (int[] arrayInt, int n) {

    for (int i = 0; i < n; i++) {
      int nInicial = arrayInt[0];

      for (int j = 0; j < arrayInt.length - 1; j++) {
        arrayInt[j] = arrayInt [j + 1];
      }

      arrayInt[arrayInt.length - 1] = nInicial;
    }

    return arrayInt;
  }
}
