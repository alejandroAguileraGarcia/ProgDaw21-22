import java.util.Scanner;

public class Ejercicio20Cuba {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int capacidad;
    int numeroAleatorio;

    System.out.print("Indique la capacidad de la cuba en litros: ");
    capacidad = s.nextInt();

    s.close();

    numeroAleatorio = (int) (Math.random() * (capacidad + 1));

    for (int i = capacidad; i >= 1; i--) System.out.println(i > numeroAleatorio ? "*    *" : "*====*");

    System.out.println("******");

  }
}
