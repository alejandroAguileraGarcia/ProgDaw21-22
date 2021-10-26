import java.util.Scanner;

public class Ejercicio43DividirNumerov2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int posicion;
    int longitud = 0;

    long numero;
    long numeroIntroducido;
    long numero1 = 0;
    long numero2 = 0;

    System.out.print("Introduce un numero entero positivo de dos digitos como minimo: ");
    numeroIntroducido = s.nextLong();

    System.out.print("Introduce la posicion a partir de la cual quiere partir el numero: ");
    posicion = s.nextInt();

    s.close();
    
    numero = numeroIntroducido;

    //Averiguamos longitud del numero

    while (numero > 0) {
      longitud++;
      numero /= 10;
    }

    numero = numeroIntroducido;

    numero1 = numero / (long) Math.pow(10, (longitud - posicion + 1));

    numero2 = numero % (long) Math.pow(10, (longitud - posicion + 1));

    System.out.printf("Los numeros partidos son %d y %d", numero1, numero2);

  }

}