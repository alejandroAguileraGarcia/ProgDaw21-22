public class Ejercicio11MostrarNumerosDiagonal {
  public static void main(String[] args) {
    
    int [][] matriz = new int [10][10];
    int suma = 0;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) matriz[i][j] = (int) (Math.random() * 101) + 200;
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) System.out.printf("%-4d", matriz[i][j]);
      System.out.println();
    }

    System.out.println();

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++){

        if (i == j) {
          System.out.printf( "%-4d", matriz[i][j]);
          suma += matriz[i][j];
        }
        
      }
    }

    System.out.println();
    System.out.println("La media es: " + (double) suma / 10);
  }
}
