public class Ejercicio09RotarMatrizCuadrada {
  public static void main(String[] args) {
    
    final int LADO = 8;

    int [][] matrizInicial = new int[LADO][LADO];
    int [][] matrizResultado = new int[LADO][LADO];

    for (int i = 0; i < LADO; i++) {
      for (int j = 0; j < LADO; j++) matrizInicial[i][j] = (int) (Math.random() * 101);
    }

    for (int i = 0; i < LADO; i++) {
      for (int j = 0; j < LADO; j++) System.out.printf("%3d ", matrizInicial[i][j]);
      System.out.println();
    }

    System.out.println();

    for (int k = 0; k < LADO / 2; k++) {
      for (int i = 1 + k; i < LADO - k; i++) matrizResultado[k][i] = matrizInicial[k][i-1];

      for (int i = k; i < LADO - k - 1; i++) matrizResultado [i][k] = matrizInicial[i+1][k];
     
      for (int i = k + 1; i < LADO - k; i++) matrizResultado[i][LADO - k - 1] = matrizInicial[i-1][LADO - k - 1];
      
      for (int i = k; i < LADO - k - 1; i++) matrizResultado[LADO-k-1][i] = matrizInicial[LADO-k-1][i + 1];
    }

    for (int i = 0; i < LADO; i++) {
      for (int j = 0; j < LADO; j++) System.out.printf("%3d ", matrizResultado[i][j]);
      System.out.println();
    }

  }
}