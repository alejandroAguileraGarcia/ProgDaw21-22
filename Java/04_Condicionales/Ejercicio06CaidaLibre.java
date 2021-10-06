import java.util.Scanner;
import java.lang.Math;

public class Ejercicio06CaidaLibre {
  public static void main(String[] args) {      
    Scanner s = new Scanner(System.in);

    double h, t;
    double g=9.81;
    
    System.out.println("¿Desde que altura cae el objeto?");
    h=s.nextDouble();

    t=Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f s en caer",t);

    s.close();
  }
}