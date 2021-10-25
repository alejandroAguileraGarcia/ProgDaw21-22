//Variante: 2 y 5:: 2^1 3^2 4^3 5^4

import java.util.Scanner;

public class Ejercicio15Potenciasv3 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int base = 0;
    int exponente = 0;
    int resultado = 1;

    System.out.print("Introduce la base de la potencia: ");
    base = s.nextInt();

    System.out.print("Introduce el exponente de la potencia: ");
    exponente = s.nextInt();

    for (int i = 1; i <= exponente; i++){
      resultado = 1;

      for (int j = 0; j < i; j++){
        resultado = resultado * base;
      }

      System.out.println(resultado);
      base++;
    }
    
    s.close();
  }

}
