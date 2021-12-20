/*Alejandro Aguilera García*/

import java.util.Scanner;

public class Ex01aag2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long numeroIntroducido;
    long digito;

    int [] contador = new int[10];

    for (int i = 0; i < 10; i++) {
      contador [i] = 0;
    }

    System.out.print("Introduzca un número entero: ");
    numeroIntroducido = s.nextLong();
    
    s.close();

    while (numeroIntroducido > 0) {
      digito = numeroIntroducido % 10;
      numeroIntroducido /= 10;

      contador[(int) digito]++;
    }

    for (int i = 0; i < 10; i++) {
      if (contador[i] != 0) System.out.printf("El dígito '%d' aparece %d veces.\n", i, contador [i]);
    }

  }
}