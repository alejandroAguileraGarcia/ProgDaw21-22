import java.util.Scanner;

public class Ejercicio60Calcetines {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;

    System.out.print("Introduce la altura de los calcetines: ");
    altura = s.nextInt();

    s.close();

    for (int i = 1; i <= (altura - 2); i++) {

      System.out.println("***     ***");

    }

    for (int i = 1; i <= 2; i++) {

      System.out.println("******  ******");

    }

  }
}
