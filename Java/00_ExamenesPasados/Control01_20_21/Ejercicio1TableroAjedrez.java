import java.util.Scanner;

public class Ejercicio1TableroAjedrez {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroFilas;
    int numeroColumnas;

    do{

      System.out.print("Introduce el número de filas (1-20): ");
      numeroFilas = s.nextInt();

      System.out.print(((numeroFilas <= 0)||(numeroFilas > 20)) ? "Valor fuera de rango. " : "");

    }while ((numeroFilas <= 0)||(numeroFilas > 20));

    do{

      System.out.print("Introduce el número de columnas (1-20): ");
      numeroColumnas = s.nextInt();

      System.out.print(((numeroColumnas <= 0)||(numeroColumnas > 20)) ? "Valor fuera de rango. " : "");

    }while ((numeroColumnas <= 0)||(numeroColumnas > 20));

    s.close();

    for (int i = 1; i <= numeroFilas; i++){

      for (int j = 1; j <= numeroColumnas; j++)System.out.print((j+i)%2 == 0 ? "██" : "  ");

      System.out.println();

    }//For filas

  }
}
