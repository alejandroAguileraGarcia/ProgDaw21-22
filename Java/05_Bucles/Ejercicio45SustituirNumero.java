import java.util.Scanner;

public class Ejercicio45SustituirNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int posicion;
    int longitud = 0;
    int digito;

    long numero;
    long numeroIntroducido;
    long numero1;
    long numero2;

    System.out.print("Introduce un numero entero positivo de dos digitos como minimo: ");
    numeroIntroducido = s.nextLong();

    System.out.print("Introduce la posicion en la que quieres introducir el digito: ");
    posicion = s.nextInt();

    System.out.print("Introduce el dígito que quieres insertar: ");
    digito = s.nextInt();

    s.close();
    
    numero = numeroIntroducido;

    //Averiguamos longitud del numero

    while (numero > 0) {
      longitud++;
      numero /= 10;
    }

    numero = numeroIntroducido;

    numero1 = numero / (long) Math.pow(10, (longitud - posicion + 1));

    numero2 = numero % (long) Math.pow(10, (longitud - posicion));
    
    System.out.println(numero1);

    System.out.println(numero2);

    numero = (numero1 * (long) Math.pow(10, (longitud - posicion + 1))) + (digito * (long) Math.pow(10, (longitud - posicion))) + numero2;

    System.out.printf("El numero resultado es: %d", numero);

  }

}