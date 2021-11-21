public class Ejercicio12Diagonal2 {
  public static void main(String[] args) {
    
    int [][] matriz = new int [9][9];
    int suma = 0;

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) matriz[i][j] = (int) (Math.random() * 401) + 500;
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) System.out.printf("%-4d", matriz[i][j]);
      System.out.println();
    }

    System.out.println();

    int contador = 8;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++){

        if (contador == j) {
          System.out.printf( "%-4d", matriz[i][j]);
          suma += matriz[i][j];
          contador--;
        }
        
      }
    }

    System.out.println();
    System.out.println("La media es: " + (double) suma / 9);
  }
}
