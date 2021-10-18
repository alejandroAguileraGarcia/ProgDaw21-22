import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int divisor = 0;

    System.out.print("Introduce un numero entero: ");
    numero=s.nextInt();

    System.out.print("Introduce otro numero entero menor al anterior: ");
    divisor=s.nextInt();

    for (int i = 1; i < numero; i++){
      if ((i % divisor) != 0){
        System.out.print(i + "\t");
      }
    }

    s.close();
  }
}
