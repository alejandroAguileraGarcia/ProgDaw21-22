import java.util.Scanner;

public class Ejercicio08AlfilAjedrezV2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int filaAlfil;
    int columnaAlfil;
    int j;
    int i;

    System.out.print("Introduce la columna en la que se encuentra el alfil en minuscula: ");
    columnaAlfil = (int) s.next().charAt(0) - 96; //De esta manera "a" equivale a 1, b a 2...

    System.out.print("Introduce la fila en la que se encuentra el alfil: ");
    filaAlfil = s.nextInt();

    s.close();

    System.out.println("El programa puede moverse a las siguientes posiciones: ");

    // Parte abajo
    j = filaAlfil;
    for (int k = 1; k < 7; k++){
      j--;
      i = columnaAlfil + k;
      if (i < 9 && j > 0) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (i + 96)), j);
      i = columnaAlfil - k;
      if (i > 0 && j > 0) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (i + 96)), j);
    }

    // Parte arriba
    j = filaAlfil;
    for (int k = 1; k < 7; k++){
      j++;
      i = columnaAlfil + k;
      if (i < 9 && j < 9) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (i + 96)), j);
      i = columnaAlfil - k;
      if (i > 0 && j < 9) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (i + 96)), j);
    }

  }
}