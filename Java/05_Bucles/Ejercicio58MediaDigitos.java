import java.util.Scanner;

public class Ejercicio58MediaDigitos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int digito;
    int numeroDigitos = 0;
    int suma = 0;
    double media;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    s.close();

    while (numero > 0) {

      digito = numero % 10;

      numero /= 10;

      suma += digito;

      numeroDigitos++;

    }//while 

    media = (double) suma / numeroDigitos;

    System.out.println(media);

  }
}
