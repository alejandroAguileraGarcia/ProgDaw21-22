package UNIDIMENSIONALES;
import java.util.Scanner;

public class Ejercicio12Rotaciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeros[] = new int[10];
    int posInicial;
    int posFinal;
    int numInicial;
    int numFinal;

    for (int i = 0; i < 10; i++) {

      System.out.print("Introduce un número entero: ");
      numeros[i] = s.nextInt();
    
    }

    //Array inicial

    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);

    do {
    
      System.out.println();

      System.out.print("Introduce la posicion inicial: ");
      posInicial = s.nextInt();

      System.out.print("Introduce la posicion final: ");
      posFinal = s.nextInt();

    } while(posInicial < 0 || posFinal < 0 || posInicial > 9 || posFinal > 9 || posFinal < posInicial);

    s.close();

    numInicial = numeros[posInicial];
    numFinal = numeros[9];
    
    for (int i = 9; i > 0; i--) {
      
      if (i == posFinal) numeros[i] = numInicial; 
      else if (!(i > posInicial && i < posFinal)) numeros[i] = numeros[i - 1];
      
    }

    numeros[0] = numFinal;

    //Array Final

    System.out.println();

    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);

  }
}
