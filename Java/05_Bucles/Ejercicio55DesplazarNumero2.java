import java.util.Scanner;

public class Ejercicio55DesplazarNumero2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int ultimoDigito;
    int numeroIntroducido;

    int reves = 0;

    int numeroFinal;

    System.out.print("Introduce un numero: ");
    numeroIntroducido = s.nextInt();

    s.close();

    ultimoDigito = numeroIntroducido % 10;

    numeroIntroducido /= 10;

    while(numeroIntroducido > 0){

      reves = (reves * 10) + (numeroIntroducido % 10);
      numeroIntroducido = numeroIntroducido / 10;

    }

    numeroIntroducido = reves;

    numeroFinal = ultimoDigito;

    while (numeroIntroducido > 0){

      numeroFinal =  (numeroFinal * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;

    }

    System.out.println("El numero resultado es: " + numeroFinal);

  }
}
