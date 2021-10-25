import java.util.Scanner;

public class Ejercicio68Dislocacion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long numero;
    long reves = 0;
    long numeroIntroducido;

    long digito;

    System.out.print("Introduce un numero: ");
    numeroIntroducido = s.nextLong();

    s.close();
    
    numero = numeroIntroducido;

    //Primero damos la vuelta al numero: 

    while(numero > 0){

      reves = (reves * 10) + (numero % 10);
      numero /= 10;

    }//While

    while (reves > 0){

      digito = reves % 10;

      if (digito % 2 == 0){

        digito++;

      }else{

        digito--;

      }

      numero = (numero * 10) + digito;
      reves /= 10;

    }//While

    System.out.printf("Dislocando %d sale el %d", numeroIntroducido, numero);

  }
}
