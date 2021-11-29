public class Ejercicio3VallePicos {
  public static void main(String[] args) {
    
    int filas = 10;
    int columnas = 10;

    int [][] arrayInicial = new int[filas][columnas];
    String [][] arrayFinal = new String[filas][columnas];
    
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        arrayInicial[i][j] = (int) (Math.random() * 1000);
        System.out.printf("%4d", arrayInicial[i][j]);
      }
      System.out.println();
    }

    if (
      arrayInicial[0][0] > arrayInicial[0][1] &&
      arrayInicial[0][0] > arrayInicial[1][0] &&
      arrayInicial[0][0] > arrayInicial[1][1]) arrayFinal[0][0] = "^";
    else if (
      arrayInicial[0][0] < arrayInicial[0][1] &&
      arrayInicial[0][0] < arrayInicial[1][0] && 
      arrayInicial[0][0] < arrayInicial[1][1]) arrayFinal[0][0] = "V";
    else arrayFinal[0][0] = " ";

    if (
      arrayInicial[filas - 1][0] > arrayInicial[filas - 1][1] &&
      arrayInicial[filas - 1][0] > arrayInicial[filas - 2][0] &&
      arrayInicial[filas - 1][0] > arrayInicial[filas - 2][1]) arrayFinal[filas - 1][0] = "^";
    else if (
      arrayInicial[filas - 1][0] < arrayInicial[filas - 1][1] &&
      arrayInicial[filas - 1][0] < arrayInicial[filas - 2][0] && 
      arrayInicial[filas - 1][0] < arrayInicial[filas - 2][1]) arrayFinal[filas - 1][0] = "V";
    else arrayFinal[filas - 1][0] = " ";

    if (
      arrayInicial[filas - 1][columnas - 1] > arrayInicial[filas - 1][columnas - 1] &&
      arrayInicial[filas - 1][columnas - 1] > arrayInicial[filas - 2][columnas - 1] &&
      arrayInicial[filas - 1][columnas - 1] > arrayInicial[filas - 2][columnas - 2]) arrayFinal[filas - 1][columnas - 1] = "^";
    else if (
      arrayInicial[filas - 1][columnas - 1] < arrayInicial[filas - 1][columnas - 1] &&
      arrayInicial[filas - 1][columnas - 1] < arrayInicial[filas - 2][columnas - 1] && 
      arrayInicial[filas - 1][columnas - 1] < arrayInicial[filas - 2][columnas - 2]) arrayFinal[filas - 1][columnas - 1] = "V";
    else arrayFinal[filas - 1][columnas - 1] = " ";


    for (int i = 1; i < filas - 1; i++){
      for (int j = 1; j < columnas - 1; j++) {
        
        if (
          arrayInicial[i][j] > arrayInicial[i - 1][j] &&
          arrayInicial[i][j] > arrayInicial[i - 1][j - 1] &&
          arrayInicial[i][j] > arrayInicial[i - 1][j + 1] &&
          arrayInicial[i][j] > arrayInicial[i + 1][j] &&
          arrayInicial[i][j] > arrayInicial[i - 1][j - 1] &&
          arrayInicial[i][j] > arrayInicial[i - 1][j + 1] &&
          arrayInicial[i][j] > arrayInicial[i][j + 1] &&
          arrayInicial[i][j] > arrayInicial[i][j - 1]) {
          
          arrayFinal [i][j] = "^";

        }else if (
          arrayInicial[i][j] < arrayInicial[i - 1][j] &&
          arrayInicial[i][j] < arrayInicial[i - 1][j - 1] &&
          arrayInicial[i][j] < arrayInicial[i - 1][j + 1] &&
          arrayInicial[i][j] < arrayInicial[i + 1][j] &&
          arrayInicial[i][j] < arrayInicial[i - 1][j - 1] &&
          arrayInicial[i][j] < arrayInicial[i - 1][j + 1] &&
          arrayInicial[i][j] < arrayInicial[i][j + 1] &&
          arrayInicial[i][j] < arrayInicial[i][j - 1]) {
          
          arrayFinal [i][j] = "V";

        }else {
          arrayFinal [i][j] = " ";
        }

      }
    }

    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++) System.out.printf(" %s ", arrayFinal[i][j]);
      System.out.println();
    }

  }
}
