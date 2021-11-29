
import java.util.Scanner;

public class Ejercicio02SumaNuméricaV5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long numero;
    long suma = 0;
    long suma2 = 5;
    long j = 4;

    System.out.print("Introduce un número: ");
    numero = s.nextLong();

    s.close();

    for (long i = 2; i <= numero; i++) {
      suma += (i - 1);

      suma2 = suma2 - i + j++;

      if (suma > suma2) suma2 += j++;
      
      if (suma2 == suma) System.out.printf("(1-%d) %d (%d-%d) Suma= %d\n", (i-1), i, (i+1), (j - 1), suma);
    }
  }
}