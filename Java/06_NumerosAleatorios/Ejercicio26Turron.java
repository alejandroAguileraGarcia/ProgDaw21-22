import java.util.Scanner;

public class Ejercicio26Turron {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int anchura;
    int altura;
    int numeroAleatorio;
    int posicion = 0;
    boolean borde;

    System.out.print("Introduce la anchura de la tableta: "); 
    anchura = s.nextInt();

    System.out.print("Introduce la altura de la tableta: ");
    altura = s.nextInt();

    s.close();

    numeroAleatorio = (int) (Math.random() * (anchura * 2 + (altura - 2) * 2));

    for (int i = 0; i < altura; i++) {

      for (int j = 0; j < anchura; j++){

        borde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);

        System.out.print(((posicion == numeroAleatorio) && borde) ? " " : "*");

        if (borde) posicion++;

      } 

      System.out.println();

    }

  }
}
