public class Ejercicio05MaxMinPos {
  public static void main(String[] args) {
    
    int [][] numeros = new int [6][10];

    int iMin = 0;
    int jMin = 0;

    int iMax = 0;
    int jMax = 0;

    int minimo = 1000;
    int maximo = 0;

    for (int i = 0; i < 6; i++){

      for (int j = 0; j < 10; j++){

        numeros [i][j] = (int) (Math.random() * 1001);

        if (numeros [i][j] < minimo){

          minimo = numeros [i][j];
          iMin = i;
          jMin = j;

        }else if (numeros [i][j] > maximo){
          
          maximo = numeros [i][j];
          iMax = i;
          jMax = j;
        }
      }
    }

    for (int i = 0; i < 6; i++){

      for (int j = 0; j < 10; j++) System.out.printf("%5d", numeros [i][j]);
      System.out.println();

    }

    System.out.println("El mínimo es: " + minimo);
    System.out.println("La columna del mínimo es: " + jMin);
    System.out.println("La fila del mínimo es: " + iMin);

    System.out.println("El máximo es: " + maximo);
    System.out.println("La columna del máximo es: " + jMax);
    System.out.println("La fila del máximo es: " + iMax);

  }
}
