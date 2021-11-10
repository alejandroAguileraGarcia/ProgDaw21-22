import java.util.Scanner;

public class Ejercicio24DigitoAleatorio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int aux;
    int numeroAleatorio;
    int longitud = 0;
    int digito;

    System.out.print("Introduce un numero positivo: ");
    numero = s.nextInt();

    s.close();

    aux = numero;

    while (aux > 0) {

      aux /= 10;
      longitud++;

    }

    numeroAleatorio = (int) (Math.random() * longitud);

    System.out.println(numeroAleatorio);

    for (int i = 0; i < numeroAleatorio; i++) {
      
      numero /= 10;

    }

    digito = numero % 10;

    System.out.println(digito);

  }
}