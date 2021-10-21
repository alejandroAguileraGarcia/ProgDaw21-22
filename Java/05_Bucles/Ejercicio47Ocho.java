import java.util.Scanner;

public class Ejercicio47Ocho {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;

    System.out.println("Introduce la altura (impar y >= que 5): ");
    altura = s.nextInt();

    s.close();

    System.out.println("MMMMM");

    for(int i=0; i < ((altura-3)/2); i++) {
      System.out.println("M   M");
    }

    System.out.println("MMMMM");

    for(int i=0; i < ((altura-3)/2); i++) {
      System.out.println("M   M");
    }

    System.out.println("MMMMM");
  }
}
