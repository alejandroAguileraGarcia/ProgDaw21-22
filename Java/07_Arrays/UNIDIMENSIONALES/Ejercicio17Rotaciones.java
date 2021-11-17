import java.util.Scanner;

public class Ejercicio17Rotaciones {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numeros = new int[10];
    int numeroIntroducido;
    int ultimoNumero;
    boolean esta = false;

    for (int i = 0; i < 10; i++) numeros[i] = (int) (Math.random() * 101);

    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();

    do {

      System.out.print("Introduce un número que esté dentro del array: ");
      numeroIntroducido = s.nextInt();

      for (int numero: numeros) if (numero == numeroIntroducido) esta = true;

      if (esta == false) System.out.println("El número no está en el array, introduzca otro");

    } while (!esta);

    s.close();

    while (numeroIntroducido != numeros[0]) {

      ultimoNumero = numeros[9];

      for (int i = 9; i > 0; i--) numeros [i] = numeros [i - 1];

      numeros[0] = ultimoNumero;
      
    }

    for (int numero: numeros) System.out.print(numero + " ");

  }
}
