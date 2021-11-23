import java.util.Scanner;

public class Ejercicio08AlfilAjedrezV3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int filaInicial;
    int columnaInicial;
    int filaActual;
    int columnaActual;

    System.out.print("Introduce la columna en la que se encuentra el alfil en minuscula: ");
    columnaInicial = (int) s.next().charAt(0) - 96; //De esta manera "a" equivale a 1, b a 2...

    System.out.print("Introduce la fila en la que se encuentra el alfil: ");
    filaInicial = s.nextInt();

    s.close();

    System.out.println("El alfil puede moverse a las siguientes posiciones: ");

    for (int i = 1; i < 7; i++){
      filaActual = filaInicial - i;

      columnaActual = columnaInicial + i;
      if (columnaActual < 9 && filaActual > 0) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (columnaActual + 96)), filaActual);

      columnaActual = columnaInicial - i;
      if (columnaActual > 0 && filaActual > 0) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (columnaActual + 96)), filaActual);

      filaActual= filaInicial + i;

      columnaActual = columnaInicial + i;
      if (columnaActual < 9 && filaActual < 9) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (columnaActual + 96)), filaActual);

      columnaActual = columnaInicial - i;
      if (columnaActual > 0 && filaActual < 9) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (columnaActual + 96)), filaActual);

    }

  }
}