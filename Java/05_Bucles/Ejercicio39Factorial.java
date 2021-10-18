import java.util.Scanner;

public class Ejercicio39Factorial {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int numero = 0;
    int factorial = 1;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    s.close();

    for (int i = 1; i <= numero; i++){
      factorial = factorial * i;
      System.out.printf("%d! = %d\n", i, factorial);
    }
  }
}
