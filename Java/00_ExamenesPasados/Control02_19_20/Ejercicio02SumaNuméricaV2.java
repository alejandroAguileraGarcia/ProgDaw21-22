import java.util.Scanner;

public class Ejercicio02SumaNuméricaV2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int suma = 0;
    int suma2;

    System.out.print("Introduce un número: ");
    numero = s.nextInt();

    s.close();

    for (int i = 1; i <= numero; i++) {
      suma += (i - 1);
      suma2 = 0;

      int j = i + 1;

      do {
        suma2 += j;
        j++;
      } while ((suma != suma2) && (j <= numero));
      
      if (suma2 == suma) System.out.printf("(1-%d) %d (%d-%d) Suma= %d\n", (i-1), i, (i+1), (j - 1), suma);
    }
  }
}
