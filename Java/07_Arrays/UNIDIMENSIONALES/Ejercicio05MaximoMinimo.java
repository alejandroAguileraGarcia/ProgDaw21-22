package UNIDIMENSIONALES;
import java.util.Scanner;

public class Ejercicio05MaximoMinimo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    int[] arrayNumeros = new int [10];
    
    System.out.print("Introduce un numero: ");

    for (int i = 0; i < 10; i++){
      
      arrayNumeros[i] = s.nextInt();

      minimo = arrayNumeros[i] < minimo ? arrayNumeros[i] : minimo;
      maximo = arrayNumeros[i] > maximo ? arrayNumeros[i] : maximo;

    }

    System.out.println("----------");
    for (int i = 9; i >= 0; i--){

      System.out.print(arrayNumeros[i] == minimo ? "Minimo " : arrayNumeros[i] == maximo ? "Maximo " : "");
      
      System.out.println(arrayNumeros[i]);

    }
    s.close();
  }
}
