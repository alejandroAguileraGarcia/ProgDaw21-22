import java.util.Scanner;

public class Ejercicio34Numeros {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    int numero1;
    int numero2;

    int reves1 = 0;
    int reves2 = 0;

    int numeroPares = 0;
    int numeroImpares = 0;
    
    int digito;

    /* Obtenemos el primer numero y le damos la vuelta */
    System.out.print("Introduce un numero: ");
    numero1 = s.nextInt();

    while(numero1 > 0){
      reves1 = (reves1 * 10) + (numero1 % 10);
      numero1 = numero1 / 10;
    }

    /* Obtenemos el segundo numero y le damos la vuelta */
    System.out.print("Introduce otro numero: ");
    numero2 = s.nextInt();

    while(numero2 > 0){
      reves2 = (reves2 * 10) + (numero2 % 10);
      numero2 = numero2 / 10;
    }

    while ((reves2 > 0) || (reves1 > 0)){
      digito = reves1 % 10;

      if (digito%2 == 0){
        numeroPares = numeroPares*10 + digito;
      }else{
        numeroImpares = numeroImpares*10 + digito;
      }

      digito = reves2 % 10;

      if (digito%2 == 0){
        numeroPares = numeroPares*10 + digito;
      }else{
        numeroImpares = numeroImpares*10 + digito;
      }

      reves1 /= 10;
      reves2 /= 10;
    }

    System.out.println("Numero pares " + numeroPares);
    System.out.println("Numero impares " + numeroImpares);
    
    s.close();
  }
}
