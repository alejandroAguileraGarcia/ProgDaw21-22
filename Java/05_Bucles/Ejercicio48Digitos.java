import java.util.Scanner;

public class Ejercicio48Digitos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    //No funciona si hay solo un cero a la izquierda. (se puede arreglar con la longitud)

    long numeroIntroducido;
    long numero;
    long digito = -1;

    String numerosAparecen = "";
    String numerosNoAparecen = "";

    boolean impreso = false;

    System.out.println("Introduce un numero entero: ");
    numeroIntroducido = s.nextLong();

    s.close();

    for (int i = 0; i < 10; i++) {
      numero = numeroIntroducido;

      while ((numero > 0)&&(impreso == false)){
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

    System.out.println("Aparecen los siguientes numeros: " + numerosAparecen);
    System.out.println("No aparecen los siguientes numeros: " + numerosNoAparecen);
  }
}
