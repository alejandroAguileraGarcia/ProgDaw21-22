import java.util.Scanner;

public class Ejercicio02Sumas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int [] [] numeros = new int [5] [6];

    for (int i = 0; i < 4; i++){
      numeros [i] [5] = 0;

      for (int j = 0; j < 5; j++){
        System.out.print("Introduce un número entero: ");
        numeros [i] [j] = s.nextInt();
        numeros [i] [5] += numeros [i] [j];
      }
    }

    s.close();

    for (int j = 0; j < 6; j++){
      numeros [4] [j] = 0;
      for (int i = 0; i < 4; i++) numeros [4] [j] += numeros [i] [j];
    }

    for (int i = 0; i < 5; i++){
      for (int j = 0; j < 6; j++) System.out.printf("%4d",numeros[i] [j]);
      System.out.println();
    }
  }
}