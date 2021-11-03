import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String cadenaDePalabras = "";
    String palabraLeida;

    do{

      System.out.print("Introduzca una palbra (acaba con salir): ");
      palabraLeida = s.nextLine();

      if (!palabraLeida.equals("salir")) cadenaDePalabras = palabraLeida + " " + cadenaDePalabras;

    } while (!palabraLeida.equals("salir"));

    System.out.println(cadenaDePalabras);

    s.close();

  }
}
