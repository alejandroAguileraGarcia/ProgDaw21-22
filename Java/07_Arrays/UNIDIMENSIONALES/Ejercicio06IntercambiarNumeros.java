import java.util.Scanner;

public class Ejercicio06IntercambiarNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int aux;
    int[] lista = new int[5];

    for (int i = 0; i < 5; i++) lista[i] = s.nextInt();

    s.close();

    aux = lista[4];

    for (int i = 4; i > 0; i--) lista[i] = lista[i - 1];

    lista[0] = aux;

    for (int i = 0; i < 5; i++) System.out.print(lista[i] + " ");
  }
}
