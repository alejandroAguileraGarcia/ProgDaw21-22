import java.util.Scanner;

public class Ejercicio03Cortos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n;
    int n1;
    int salto;
    
    System.out.print("Introduce la cantidad de numeros: ");
    n = s.nextInt();

    System.out.print("Introduce el primer numero: ");
    n1 = s.nextInt();

    System.out.print("Introduce el salto: ");
    salto = s.nextInt();

    s.close();

    for(int i = n1; i < (n1 + n * salto); i += salto) {
      System.out.printf("%d ", i);
    }
    
  }
}
