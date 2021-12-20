public class Ejercicio3VallePicosV2 {
  public static void main(String[] args) {
    
    int filas = 10;
    int columnas = 10;
    int minimo;
    int maximo;

    int [][] arrayInicial = new int[filas][columnas];
    String [][] arrayFinal = new String[filas][columnas];
    
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        arrayInicial[i][j] = (int) (Math.random() * 1000);
        System.out.printf("%4d", arrayInicial[i][j]);
      }
      System.out.println();
    }


    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++) {
        maximo = -1;
        minimo = 1001;
        for (int k = i - 1; k <= i + 1; k++) {
          for (int z = j - 1; z <= j + 1; z++) {
            if (k >= 0 && k < filas && z >= 0 && z < columnas && !(z == j && k == i)) {
              if (arrayInicial [k][z] > maximo) maximo = arrayInicial [k][z];
              if (arrayInicial [k][z] < minimo) minimo = arrayInicial [k][z];
            }
          }
        }
        if (minimo >= arrayInicial [i][j]) arrayFinal [i][j] = "v";
        else if (maximo <= arrayInicial[i][j]) arrayFinal [i][j] = "^";
        else arrayFinal [i][j] = " ";

      }
    }

    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++) System.out.printf("%4s", arrayFinal[i][j]);
      System.out.println();
    }

  }
}

/*public class Ejercicio03 {
  public static void main(String[] args) {
    int[][] matriz;
    int numFilas, numColumnas, minRango, maxRango;

    System.out.print("Indique el nº de filas de la matriz (1-10): ");
    numFilas = Integer.parseInt(System.console().readLine());

    System.out.print("Indique el nº de columnas de la matriz (1-15): ");
    numColumnas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el valor mínimo del rango aleatorio (1-999): ");
    minRango = Integer.parseInt(System.console().readLine());

    System.out.print("Indique el valor máximo del rango aleatorio (1-999): ");
    maxRango = Integer.parseInt(System.console().readLine());

    System.out.println();

    boolean valoresCorrectos = numFilas > 0 && numFilas <= 10
      && numColumnas > 0 && numColumnas <= 15
      && minRango > 0 && minRango <= 999
      && maxRango >= minRango && maxRango <= 999;

    if (valoresCorrectos) {
      matriz = new int[numFilas][numColumnas];

      System.out.println("Matriz de datos generada:");
      for (int fila = 0; fila < numFilas; fila++) {
        for (int columna = 0; columna < numColumnas; columna++) {
          int num = (int) (Math.random() * (maxRango + 1 - minRango)) + minRango;
          matriz[fila][columna] = num;

          System.out.printf("%3d%s", num, (columna < numColumnas - 1 ? "│" : ""));
        }

        System.out.println();

        if (fila + 1 != numFilas) {
          for (int i = 0; i < numColumnas * 4; i++) {
            System.out.print((i + 1) % 4 == 0 && i + 1 != numColumnas *  4 ? "┼" : "─");
          }
          System.out.println();
        }
      }

      System.out.println("\nA continuación, se señalan los picos (^) y los valles (v):");
      for (int fila = 0; fila < numFilas; fila++) {
        for (int columna = 0; columna < numColumnas; columna++) {
          String valor = " ";
          int max = minRango;
          int min = maxRango;

          for (int filaBuscando = fila - 1; filaBuscando <= fila + 1; filaBuscando++) {
            for (int columnaBuscando = columna - 1; columnaBuscando <= columna + 1; columnaBuscando++) {
              if (filaBuscando >= 0 && filaBuscando < numFilas && columnaBuscando >= 0 && columnaBuscando < numColumnas) {
                if (filaBuscando == fila ? columnaBuscando == columna ? false : true : true) {
                  int numBuscando = matriz[filaBuscando][columnaBuscando];
                  if (numBuscando < min) min = numBuscando;
                  if (numBuscando > max) max = numBuscando;
                }
              }
            }
          }
          int num = matriz[fila][columna];
          if (num >= max) valor = "^"; 
          if (num <= min) valor = "v"; 
          System.out.printf("%3s%s", valor, (columna < numColumnas - 1 ? "│" : ""));
        }
        
        System.out.println();
        
        if (fila + 1 != numFilas) {
          for (int i = 0; i < numColumnas * 4; i++) {
            System.out.print((i + 1) % 4 == 0 && i + 1 != numColumnas *  4 ? "┼" : "─");
          }
          System.out.println();
        }
      }
    }
  }
} */