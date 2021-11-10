import java.util.Scanner;

public class Ejercicio22Serpiente {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int longitud;
    int espacios = 12;

    System.out.print("Introduce la longitud de la serpiente en caracteres: ");
    longitud = s.nextInt();

    s.close();

    for (int i = 0; i < longitud; i++) {

      for (int j = 0; j < espacios; j++) System.out.print(" ");

      System.out.println( i == 0 ? "@" : "*");

      espacios += (int) (Math.random() * 3) - 1;

    }
  }
}