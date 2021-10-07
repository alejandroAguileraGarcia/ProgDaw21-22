import java.util.Scanner;

public class Ejercicio11CuadradoCubo {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    double numeroIntroducido;

    System.out.print("Introduce un numero: ");
    numeroIntroducido = s.nextDouble();

    /* MI FORMA
    for (int i = 1; i <= 5; i++) {
      numeroIntroducido = numeroIntroducido+1;
      System.out.printf("%-10s%-10s%-10s\n", String.valueOf(numeroIntroducido), String.valueOf(Math.pow(numeroIntroducido,2)), String.valueOf(Math.pow(numeroIntroducido,3)));
    }
    */

    for (double i = numeroIntroducido; i <= numeroIntroducido+5; i++) {
      System.out.printf("%-10s%-10s%-10s\n", String.valueOf(i), String.valueOf(Math.pow(i,2)), String.valueOf(Math.pow(i,3)));
    }

    s.close();
  }
}
