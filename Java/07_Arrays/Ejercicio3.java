import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] arrayNumeros = new int [10];
    
    System.out.print("Introduce un numero: ");

    for (int i = 0; i < 10; i++) arrayNumeros[i] = s.nextInt();

    for (int i = 9; i >= 0; i--) System.out.println(arrayNumeros[i]);

    s.close();
  }
}
