import java.util.Scanner;

public class Ejercicio52DesplazarNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long numero;
    long reves = 0;
    long reves2 = 0;

    System.out.print("Introduce un numero mayor que cero: ");
    numero = s.nextLong();

    s.close();

    //Damos la vuelta al numero, quedandonos con el primer digito por la izquierda guardado en numero

    while (numero > 10) {
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
    }

    //Le doy la vuelta a reves y despues le inserto la variable numero ("ultimo digito")

    while (reves > 0){
      reves2 = (reves2 * 10) + (reves % 10);
      reves /= 10;
    }

    reves2 = (reves2 * 10) + numero;

    System.out.print("El resultado es " + reves2);

  }
}
