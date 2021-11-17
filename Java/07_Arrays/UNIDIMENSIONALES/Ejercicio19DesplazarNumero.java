package UNIDIMENSIONALES;
import java.util.Scanner;

public class Ejercicio19DesplazarNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int [] numeros = new int[12];

    int numeroIns;
    int posNum;

    for (int i = 0; i < 12; i++) numeros[i] = (int) (Math.random() * 201);

    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();

    System.out.print("Introduzca el número que quieres insertar: ");
    numeroIns = s.nextInt();

    System.out.print("Introduzca la posición donde lo quieres insertar (0-11): ");
    posNum = s.nextInt();

    s.close();

    for (int i = 11; i > posNum; i--) numeros [i] = numeros [i - 1];

    numeros [posNum] = numeroIns;
   
    for (int numero: numeros) System.out.print(numero + " ");
  }
}
