import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n;
    int n1;
    
    System.out.print("Introduce la cantidad de numeros: ");
    n = s.nextInt();

    System.out.print("Introduce el primer numero: ");
    n1 = s.nextInt();

    s.close();

    for(int i = n1; i < (n+n1); i++) {
      System.out.printf("%d ", i);
    }
    
  }
}
