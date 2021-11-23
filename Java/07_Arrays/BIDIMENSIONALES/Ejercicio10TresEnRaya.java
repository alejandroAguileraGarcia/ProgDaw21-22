import java.util.Scanner;

public class Ejercicio10TresEnRaya {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String tablero[][] = new String[3][3];
    boolean ganador1 = false;
    boolean ganador2 = false;
    int columna;
    int fila;
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) tablero[i][j] = " ";
    }

    System.out.println("┌─┬─┬─┐");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++){
        System.out.print("│" + tablero[i][j]);
      }
      System.out.println("│");
      System.out.println(i == 2 ? "└─┴─┴─┘" : "├─┼─┼─┤");
    }

    do {

      System.out.println("Jugador 1:");
      System.out.print("Introduce tu columna: ");
      columna = s.nextInt();
      System.out.print("Introduce tu fila: ");
      fila = s.nextInt();

      tablero [fila - 1][columna - 1] = "X";

      System.out.println("┌─┬─┬─┐");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++){
          System.out.print("│" + tablero[i][j]);
        }
        System.out.println("│");
        System.out.println(i == 2 ? "└─┴─┴─┘" : "├─┼─┼─┤");
      }

      for (int i = 0; i < 3; i++) {
        if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals(tablero[i][2]) && !tablero[i][0].equals(" ")) ganador1 = true;
        if (tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals(tablero[2][i]) && !tablero[0][i].equals(" ")) ganador1 = true;
      }

      if (tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && !tablero[1][1].equals(" "))  ganador1 = true;
      if (tablero[2][0].equals(tablero[1][1]) && tablero[2][0].equals(tablero[0][2]) && !tablero[1][1].equals(" "))  ganador1 = true;

      if (ganador1 == false) {
        System.out.println("Jugador 2:");
        System.out.print("Introduce tu columna: ");
        columna = s.nextInt();
        System.out.print("Introduce tu fila: ");
        fila = s.nextInt();

        tablero [fila - 1][columna - 1] = "O";

        System.out.println("┌─┬─┬─┐");
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++){
            System.out.print("│" + tablero[i][j]);
          }
          System.out.println("│");
          System.out.println(i == 2 ? "└─┴─┴─┘" : "├─┼─┼─┤");
        }

        for (int i = 0; i < 3; i++) {
          if (tablero[i][0].equals(tablero[i][1]) && tablero[i][0].equals(tablero[i][2]) && !tablero[i][0].equals(" ")) ganador2 = true;
          if (tablero[0][i].equals(tablero[1][i]) && tablero[0][i].equals(tablero[2][i]) && !tablero[0][i].equals(" ")) ganador2 = true;
        }

        if (tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && !tablero[1][1].equals(" "))  ganador2 = true;
        if (tablero[2][0].equals(tablero[1][1]) && tablero[2][0].equals(tablero[0][2]) && !tablero[1][1].equals(" "))  ganador2 = true;

      }
      
    } while (!ganador1 && !ganador2);

    s.close();
    
  }
}
