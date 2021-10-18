import java.util.Scanner;

public class Ejercicio32CifrasNumero {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    long numero;
    long digito;
    long reves = 0;
    long suma = 0;

    System.out.print("Introduce un numero entero positivo: ");
    numero = s.nextLong();

    s.close();

    System.out.print("Digitos pares: ");

    while(numero > 0){
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
    }

    while(reves>0){
      digito = reves % 10;
      reves /= 10;
      
      if (digito%2 == 0){
        System.out.print(digito + " ");
        suma += digito;
      }
    }

    System.out.println();

    System.out.print("La suma es: "+ suma);

  }
}
