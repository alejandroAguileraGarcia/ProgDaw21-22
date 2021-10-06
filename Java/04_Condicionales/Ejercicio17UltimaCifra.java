import java.util.Scanner;

public class Ejercicio17UltimaCifra {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int x;

    System.out.println("Introduce un numero entero: ");
    x = s.nextInt();

    System.out.printf("La ultima cifra del numero introducido es: %d", (x%10));

    s.close();
  }
}
