import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n;
    
    System.out.print("Introduce la cantidad de numeros: ");
    n = s.nextInt();

    s.close();

    for(int i = 1; i <= n; i++) {
      System.out.printf("%d ", i);
    }
    
  }
}
