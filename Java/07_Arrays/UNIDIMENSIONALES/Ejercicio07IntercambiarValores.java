package UNIDIMENSIONALES;
import java.util.Scanner;

public class Ejercicio07IntercambiarValores {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int lista[] = new int[100];
    int numero;
    int numeroNuevo;

    for (int i = 0; i < 100; i++) lista[i] = (int) (Math.random() * 21);

    for (int i = 0; i < 100; i++) System.out.print(lista[i] + " ");

    System.out.println();

    System.out.println("Introduce un número de la lista: ");
    numero = s.nextInt();

    System.out.println("Introduce el número por el que quieres sustituirlo: ");
    numeroNuevo = s.nextInt();

    System.out.println();

    s.close();

    for (int i = 0; i < 100; i++){

      if (lista[i] == numero){

        lista[i] =  numeroNuevo;
        System.out.print("\"" + lista[i] + "\" ");

      }else System.out.print(lista[i] + " ");

    }
  }
}
