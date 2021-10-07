import java.util.Scanner;

public class Ejercicio15Potencias2 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int base = 0;
    int exponente = 0;
    int resultado = 1;

    System.out.print("Introduce la base de la potencia: ");
    base = s.nextInt();

    System.out.print("Introduce el exponente de la potencia: ");
    exponente = s.nextInt();

    for (int i = 0; i < exponente; i++){
      resultado = resultado * base;
      System.out.println(resultado);
    }
    
    s.close();
  }

}
