import java.util.Scanner;

public class Ejercicio14Par {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int x;
    
    System.out.println("Introduce un numero: ");
    x = s.nextInt();

    if (x%2==0){
      System.out.println("El numero es par");
    }else{
      System.out.println("El numero es impar");
    }

    if (x%5==0){
      System.out.println("El numero es divisible entre 5");
    }else{
      System.out.println("El numero no es divisible entre 5");
    }

    s.close();
  }
}
