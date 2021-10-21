import java.util.Scanner;

public class Ejercicio41ParesImpares {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    long numero;
    long digito;
    
    int digitosPares = 0;
    int digitosImpares = 0;

    System.out.print("Introduce un numero entero positivo: ");
    numero = s.nextLong();

    s.close();

    while (numero > 0){
      digito = numero % 10;

      if (digito%2 == 0){
        digitosPares++;
      }else{
        digitosImpares++;
      }

      numero /= 10;
    }

    System.out.printf("Hay %d digitos pares y %d digitos impares", digitosPares, digitosImpares);
  }
}
