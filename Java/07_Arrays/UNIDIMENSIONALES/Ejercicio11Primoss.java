package UNIDIMENSIONALES;
import java.util.Scanner;

public class Ejercicio11Primoss {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[10];
    int[] primos = new int[10];
    int[] resto = new int[10];
    int cantPrimos = 0;
    int cantResto = 0;
    int divisores;

    for (int i = 0; i < 10; i++) {

      System.out.print("Introduce un número entero: ");
      numeros[i] = s.nextInt();

      divisores = 0;

      for (int j = 1; j <= numeros[i]; j++) {
        if (numeros [i] % j == 0) divisores++;
      }

      if (divisores > 2) {
        primos[cantPrimos] = numeros[i];
        cantPrimos++;
      }else{
        resto[cantResto] = numeros[i];
        cantResto++;
      }

    }

    s.close();

    //Array inicial

    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);


    //Movimiento
    
    for (int i = 0; i < 10; i++) numeros[i] = primos[i];
    
    for (int i = cantPrimos; i < 10; i++) numeros[i] = resto[i - cantPrimos];

    //Array final

    System.out.println();

    System.out.print("Indice: ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (int i = 0; i < 10; i++) System.out.printf("%-4d", numeros[i]);
  }
}
