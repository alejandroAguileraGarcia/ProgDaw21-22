import java.util.Scanner;

public class Ejercicio02SumaNumérica {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int suma;
    int suma2;

    System.out.print("Introduce un número: ");
    numero = s.nextInt();

    s.close();

    for (int i = 1; i <= numero; i++) {
      suma = 0;
      suma2 = 0;

      int j;

      for (j = 1; j < i; j++) {
        suma += j;
      }

      j = i + 1;
      do {
        suma2 += j;
        j++;
      } while ((suma != suma2) && (j <= numero));
      
      if (suma2 == suma) System.out.printf("(1-%d) %d (%d-%d) Suma= %d\n", (i-1), i, (i+1), (j - 1), suma);
    }
  }
}
