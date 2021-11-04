import java.util.Scanner;

public class Ejercicio2PareseImpares {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long numeroIntroducido;
    long numero;

    int numeroImpares;
    int numeroPares;
    int digito;

    boolean par = false;

    System.out.print("Introduce un numero largo positivo: ");
    numeroIntroducido = s.nextLong();

    s.close();

    numero = numeroIntroducido;

    while (numero > 0){
      digito = numero % 10;
      numero /= 10;

    }

    for (int i = 0; i < 10; i++) {
      numero = numeroIntroducido;

      while (numero > 0){
        digito = numero % 10;
        numero /= 10;

        if (digito == i){
          numerosAparecen = numerosAparecen + " " + Integer.toString(i);
          impreso = true;
        }


      }//while

      if (impreso ==false){
        numerosNoAparecen = numerosNoAparecen + " " + Integer.toString(i);
      }

      impreso = false;

    }//for

  }
}
