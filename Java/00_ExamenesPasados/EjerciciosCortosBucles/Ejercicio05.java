import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    
    int cantidadEspacios = 0;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    s.close();

    for (int i = 1; i <= numero; i++){

      for (int j = 0; j < cantidadEspacios; j++){
        System.out.print(" ");
      }
      
      cantidadEspacios++;

      System.out.println(i);

    } //For figura 1

    cantidadEspacios = 0;

    for (int i = 1; i <= numero; i++){

      for (int j = 0; j < cantidadEspacios; j++){
        System.out.print(" ");
      }
      
      cantidadEspacios++;

      for (int j = 1; j <= cantidadEspacios; j++){
        System.out.print(j);
      }

      System.out.println();

    } //For figura 2

    cantidadEspacios = 0;

    for (int i = 1; i <= numero; i++){

      for (int j = 0; j < cantidadEspacios; j++){
        System.out.print(" ");
      }
      
      cantidadEspacios++;

      for (int j = 0; j < cantidadEspacios; j++){
        System.out.print(numero - j);
      }

      System.out.println();

    } //For figura 3

  }
}
