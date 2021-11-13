import java.util.Scanner;

public class Ejercicio32Sendero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int longitud;
    int espacios = 10;
    int aleatorio;
    char obstaculo;

    System.out.print("Introduzca la longitud del sendero en metros: ");
    longitud = s.nextInt();

    s.close();

    for (int i = 1; i <= longitud; i++) {

      aleatorio = (int) (Math.random() * 4);

      switch (aleatorio) {
        case 1:
          obstaculo = '*';
          break;
        case 2:
          obstaculo = 'o';
          break;
        default:
          obstaculo = ' ';
          break;
      }

      aleatorio = (int) (Math.random() * 4) + 1;

      for (int j = 0; j < espacios; j++) System.out.print(" ");

      for (int j = 0; j < 6; j++) System.out.print(j == 0 || j == 5 ? "|" : (j == aleatorio) ? obstaculo : " ");

      System.out.println();

      espacios += (int) (Math.random() * 3) - 1;

    }//For
  }
}
