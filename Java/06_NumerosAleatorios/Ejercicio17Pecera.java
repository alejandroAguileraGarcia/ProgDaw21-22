import java.util.Scanner;

public class Ejercicio17Pecera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int anchura;

    int alturaAleatoria;
    int anchuraAleatoria;

    System.out.print("Introduzca la altura de la pecera: ");
    altura = s.nextInt();

    System.out.print("Introduzca la anchura de la pecera: ");
    anchura = s.nextInt();

    s.close();

    anchuraAleatoria = (int) (Math.random() * (anchura - 2) + 2);
    alturaAleatoria = (int) (Math.random() * (altura - 2) + 2);

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= anchura; j++){
        if (i == 1 || i == altura || j == 1 || j == anchura) System.out.print("* ");
        else if (i == alturaAleatoria && j == anchuraAleatoria) System.out.print("& ");
        else System.out.print("  ");
      }
      System.out.println();
    }

  }
}