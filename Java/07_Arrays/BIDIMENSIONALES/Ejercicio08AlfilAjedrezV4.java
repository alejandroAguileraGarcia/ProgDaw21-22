import java.util.Scanner;

public class Ejercicio08AlfilAjedrezV4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int filaInicial;
    int columnaInicial;

    System.out.print("Introduce la columna en la que se encuentra el alfil en minuscula: ");
    columnaInicial = (int) s.next().charAt(0) - 96; //De esta manera "a" equivale a 1, b a 2...

    System.out.print("Introduce la fila en la que se encuentra el alfil: ");
    filaInicial = s.nextInt();

    s.close();

    System.out.println("El alfil puede moverse a las siguientes posiciones: ");

    for (int filaActual = 1; filaActual < 9; filaActual++) {
      for (int columnaActual = 1; columnaActual < 9; columnaActual++) {
        if ((Math.abs(filaActual - filaInicial) == Math.abs(columnaActual - columnaInicial)) && filaActual != filaInicial) System.out.printf("C: %s F: %d\n", String.valueOf((char) (columnaActual + 96)), filaActual);
      }
    }

  }
}