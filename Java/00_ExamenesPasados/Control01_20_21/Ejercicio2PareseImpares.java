import java.util.Scanner;

public class Ejercicio2PareseImpares {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long numero;
    long reves = 0;

    long numeroImpares = 0;
    long numeroPares = 0;

    long digito;

    System.out.print("Introduce un numero largo positivo: ");
    numero = s.nextLong();

    s.close();

    while (numero > 0){

      digito = numero % 10;
      numero /= 10;

      if (digito % 2 != 0){
        numeroImpares = numeroImpares * 10 + digito;
      }else {
        reves = reves * 10 + digito;
      }

    }//While

    while (reves > 0){

      digito = reves % 10;
      reves /= 10;

      numeroPares = numeroPares * 10 + digito;

    }

    System.out.println(numeroImpares);
    System.out.println(numeroPares);

  }
}
