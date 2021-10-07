import java.util.Scanner;

public class Ejercicio12Fibonacci {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numeroAnterior = 1;
    int numero=1;
    int n = 0;

    System.out.print("Introduce un numero: ");
    n=s.nextInt();

    switch (n){
      case 1:
        System.out.println("0");
        break;
      case 2:
        System.out.println("0 1");
        break;
      default:
        System.out.println("0");
        System.out.println("1");
        for (int i = 0; i < (n-2); i++) {
          System.out.println(numero);
          numero = numero + numeroAnterior;
          numeroAnterior = numero - numeroAnterior;
        }
        break;
    }

    s.close();
  }
}
