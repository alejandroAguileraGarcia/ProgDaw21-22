public class Ejercicio50 {
  public static void main(String[] args) {
    int [] a = new int[6];
    int [] b = new int[4];

    a [0] = 1;
    a [1] = 2;
    a [2] = 8;
    a [3] = 9;
    a [4] = 10;
    a [5] = 11;
    b [0] = 3;
    b [1] = 4;
    b [2] = 5;
    b [3] = 6;

    int [] resultado = mezcla(a, b);

    for (int i = 0; i < resultado.length; i++) {
      System.out.print(resultado[i] + " ");
    }

  }
  
  public static int[] mezcla (int a[], int b[]){

    int [] resultado = new int[a.length + b.length];

    int [] arrayMayor;
    int [] arrayMenor;

    if (a.length > b.length) {
      arrayMayor = a;
      arrayMenor = b;
    }else {
      arrayMenor = a;
      arrayMayor = b;
    }

    int j = 0;
    for (int i = 0; i < arrayMenor.length * 2; i++) {

      if (i % 2 == 0) resultado[i] = a[j];
      else resultado[i] = b[j++];

    }

    for (int i = arrayMenor.length * 2; i < resultado.length; i++) {
      resultado[i] = arrayMayor[j++];
    }

    return resultado;
  }
}