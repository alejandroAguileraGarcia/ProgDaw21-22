import java.util.Scanner;

public class Ejercicio09ParImpar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[8];

    for (int i = 0; i < 8; i++) {

      System.out.print("Introduce un numero entero: ");
      numero[i] = s.nextInt();

    }

    s.close();

    for (int x: numero) {

      System.out.print(x % 2 == 0 ? "Par: " : "Impar: ");
      System.out.println(x);
      
    }

  }
}
