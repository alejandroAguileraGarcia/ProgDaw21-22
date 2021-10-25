import java.util.Scanner;

public class Ejercicio62NumeroOriental {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int digito;

    int suerte = 0;
    int malaSuerte = 0;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    s.close();

    while (numero >0){
      digito = numero % 10;
      numero /= 10;

      if ((digito == 3)||(digito == 7)||(digito == 8)||(digito == 9)){

        suerte++;

      }else{

        malaSuerte++;

      }
    }

    if (suerte > malaSuerte){

      System.out.println("El numero es afortunado");

    }else{

      System.out.println("El numero no es afortunado");
    }

  }
}
