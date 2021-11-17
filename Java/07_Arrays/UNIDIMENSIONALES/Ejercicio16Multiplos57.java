import java.util.Scanner;

public class Ejercicio16Multiplos57 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numeros = new int[20];
    int opcion;

    for (int i = 0; i < 20; i++) numeros[i] = (int) (Math.random() * 401);

    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();

    System.out.print("¿Qué números quiere resaltar? 1 - múltiplos de 5, 2 - múltiplos de 7: ");
    opcion = s.nextInt();

    s.close();

    for (int numero: numeros) {

      if (opcion == 1 && numero % 5 == 0) System.out.print("[" + numero + "] ");
      else if (opcion == 2 && numero % 7 == 0) System.out.print("[" + numero + "] ");
      else System.out.print(numero + " ");

    }
  }
}
