import java.util.Scanner;

public class Ejercicio12Fibonacci {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numeroAnterior = 0;
    int numero=1;
    int n = 0;

    System.out.print("Introduce un numero: ");
    n=s.nextInt();

    if (n > 0){
      System.out.println("0");
    }
    
    if (n == 2){
      System.out.println("1");
    }
    
    if (n > 2){
      for (int i = 1; i < n; i++) {
        System.out.println(numero);
        numero = numero + numeroAnterior;
        numeroAnterior = numero - numeroAnterior;
      }
    }

    s.close();
  }
}
