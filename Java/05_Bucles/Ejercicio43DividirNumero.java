/*
import java.util.Scanner;

public class Ejercicio43DividirNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int posicion;
    long numero;
    long reves = 0;
    long numero2 = 0;

    System.out.print("Introduce un numero entero positivo de dos digitos como minimo: ");
    numero = s.nextLong();

    System.out.print("Introduce la posicion a partir de la cual quiere partir el numero: ");
    posicion = s.nextInt();

    s.close();

    while (numero > (Math.pow(10, (posicion-1)))) {
      numero2 = (numero2 * 10) + (numero % 10);
      numero /= 10;
    }

    while(numero2 > 0){
      reves = (reves * 10) + (numero2 % 10);
      numero2 = numero2 / 10;
    }

    System.out.printf("Los numeros partidos son %d y %d", numero, reves);

  }

}
*/

import java.util.Scanner;

public class Ejercicio43DividirNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int posicion;
    long numero;
    long reves = 0;
    long numero2 = 0;

    System.out.print("Introduce un numero entero positivo de dos digitos como minimo: ");
    numero = s.nextLong();

    System.out.print("Introduce la posicion a partir de la cual quiere partir el numero: ");
    posicion = s.nextInt();

    s.close();

    while (numero > (Math.pow(10, (posicion-1)))) {
      numero2 = (numero2 * 10) + (numero % 10);
      numero /= 10;
    }

    while(numero2 > 0){
      reves = (reves * 10) + (numero2 % 10);
      numero2 = numero2 / 10;
    }

    System.out.printf("Los numeros partidos son %d y %d", numero, reves);

  }

}