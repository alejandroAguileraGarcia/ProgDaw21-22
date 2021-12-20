/*Alejandro Aguilera García*/

import java.util.Scanner;

public class Ex01aag3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int [] numeros = {112233, 445566, 778899};
    int numeroAleatorio = numeros[(int) (Math.random() *3)];
    int digito;

    boolean acertado = false;

    String StringAleatorio = String.valueOf(numeroAleatorio);
    String numeroDesordenado = "";
    String numeroLeido;

    for (int i = 1; i <= StringAleatorio.length(); i++) {
      digito = numeroAleatorio % 10;
      numeroAleatorio /= 10;

      int posicionAleatoria = (int) (Math.random() * 2);

      if (posicionAleatoria == 0) numeroDesordenado = numeroDesordenado + String.valueOf(digito);
      else numeroDesordenado = String.valueOf(digito) + numeroDesordenado;

    }

    for (int i = 5; i > 0 && acertado == false; i--) {
      System.out.printf("Tiene %d intentos. Diga número con los dígitos '%s': ", i, numeroDesordenado);
      numeroLeido = s.nextLine();

      if (numeroLeido.equals(StringAleatorio)) acertado = true;
    }

    s.close();

    if (acertado) System.out.println("Felicidades. Ha acertado el número.");
    else System.out.printf("El número que tenia que acertar es: %s", StringAleatorio);

  }
}
