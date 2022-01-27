import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroPalabras = 0;

    String cadenaDePalabras = "";
    String palabraLeida;

    do{

      System.out.print("Introduzca una palabra (acaba con salir): ");
      palabraLeida = s.nextLine();

      if (!palabraLeida.equals("salir")) cadenaDePalabras = palabraLeida + " " + cadenaDePalabras;

      numeroPalabras++;

    } while ((!palabraLeida.equals("salir"))&&(numeroPalabras != 4));
    
    s.close();
    
    System.out.println(cadenaDePalabras);


  }
}
