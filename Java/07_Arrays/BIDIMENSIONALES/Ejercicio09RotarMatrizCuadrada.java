public class Ejercicio09RotarMatrizCuadrada {
  public static void main(String[] args) {
    
    int [][] matriz = new int[4][4];
    int  numeroFinal;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) matriz[i][j] = (int) (Math.random() * 101);
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) System.out.printf("%4d", matriz[i][j]);
      System.out.println();
    }

  }
}