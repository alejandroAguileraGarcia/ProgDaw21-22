import java.util.Scanner;

public class Ejercicio08AlfilAjedrez {
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

    // Parte derecha abajo
    i = columnaAlfil;
    j = filaAlfil;
    while (i < 9 && i < 8 && j > 1) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (++i + 96)), --j);
    
    //Parte izquierda abajo
    i = columnaAlfil;
    j = filaAlfil;
    while (i < 9 && i > 1 && j > 1) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (--i + 96)), --j);

    //Parte izquierda arriba
    i = columnaAlfil;
    j = filaAlfil;
    while (i < 9 && i > 1 && j < 8) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (--i + 96)), ++j);
    
    //Parte derecha arriba
    i = columnaAlfil;
    j = filaAlfil;
    while (i < 9 && i < 8 && j < 8) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (++i + 96)), ++j);

  }
}