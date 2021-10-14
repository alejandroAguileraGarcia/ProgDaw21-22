import java.util.Scanner;

public class Ejercicio28Factorial {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int numeroIntroducido = 0;
    int factorial = 1;

    System.out.print("Introduce un numero entero: ");
    numeroIntroducido = s.nextInt();

    for(int i = numeroIntroducido; i > 1; i--){
      factorial = factorial * i;
    }
    
    System.out.println(factorial);

    s.close();
  }
}