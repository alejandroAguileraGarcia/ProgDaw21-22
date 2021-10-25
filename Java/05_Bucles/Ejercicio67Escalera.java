import java.util.Scanner;

public class Ejercicio67Escalera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroEscalones;
    int alturaEscalones;

    System.out.print("Introduce el numero de escalones: ");
    numeroEscalones = s.nextInt();

    System.out.print("Introduce la altura de cada escalon: ");
    alturaEscalones = s.nextInt();

    s.close();

    for (int i = 1; i <= numeroEscalones; i++){

      for (int j = 1; j <= alturaEscalones; j++){
        
        for (int k = 1; k <= i; k++){

          System.out.print("****");

        }
        
        System.out.println();
        
      }

    }

  }
}
