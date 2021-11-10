import java.util.Scanner;

public class EjercicioAnillo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int dimensiones;
    int numeroInicial;
    int contador = 1;

    System.out.print("Introduce la altura y la anchura del anillo: ");
    dimensiones = s.nextInt();

    s.close();

    numeroInicial = dimensiones / 2 + 1;

    for (int i = 1; i <= dimensiones; i++) {

      for (int j = 1; j <= dimensiones; j++) {

        if (i == contador || j == contador || i == dimensiones - contador + 1 || j == dimensiones - contador + 1) System.out.print(numeroInicial - contador + 1);

      }

      System.out.println();
      contador++;

    }

  }
}
