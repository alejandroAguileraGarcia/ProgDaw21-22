import java.util.Scanner;

public class Ejercicio01PiramideDentroPiramide {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int margen;

    System.out.print("Introduce la altura de la pirámide: ");
    altura = s.nextInt();

    System.out.print("Introduce el margen: ");
    margen = s.nextInt();

    s.close();

    int espaciosDelanteros = altura - 1;
    int relleno = 1;
    int espaciosMedio = 1;

    for (int i = 1; i <= altura; i++) {
      for (int j = 0; j < espaciosDelanteros; j++) System.out.print(" ");

      if (i <= margen || i > altura - margen) for (int j = 0; j < relleno; j++) System.out.print("*");
      else {
        for (int j = 0; j < margen; j++) System.out.print("*");
        for (int j = 0; j < espaciosMedio; j++) System.out.print(" ");
        for (int j = 0; j < margen; j++) System.out.print("*");
        espaciosMedio += 2;
      }

      espaciosDelanteros--;
      relleno += 2;
      System.out.println();
    }
  }
}