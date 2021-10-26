import java.util.Scanner;

public class Ejercicio44IntroducirNumerov1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long numero1 = 0;
    long numero2 = 0;

    long reves1 = 0;

    int posicion;
    long digito;

    long digitoaux = 0;

    long resultado = 0;

    System.out.print("Introduce un numero entero positivo: ");
    numero1 =  s.nextLong();

    System.out.print("Introduce la posicion donde quiere insertar: ");
    posicion =  s.nextInt();

    System.out.print("Introduce el digito que quiere insertar: ");
    digito =  s.nextLong();

    s.close();

    //Separamos el numero en dos partes para introducir el numero en medio y al hacerlo le hemos dado la vuelta a numero 2 (la segunda parte)

    while (numero1 > (Math.pow(10, (posicion-1)))) {
      numero2 = (numero2 * 10) + (numero1 % 10);
      numero1 /= 10;
    }

    System.out.println(numero1);
    System.out.println(numero2);
    System.out.println();
    //Damos la vuelta a numero1 (primera parte)

    while(numero1 > 0){
      reves1 = (reves1 * 10) + (numero1 % 10);
      numero1 = numero1 / 10;
    }

    System.out.println(numero1);
    System.out.println(numero2);
    System.out.println();
    //Vamos concatenando los digitos, primero los de la primera parte al reves, despues introducimos el digito deseado y por ultimo metemos los digitos de la segunda parte.
    while (reves1 > 0){
      digitoaux = reves1 % 10;
      resultado = resultado * 10 + digitoaux;
      reves1 /= 10;
    }

    resultado = resultado * 10 + digito;

    while (numero2 > 0){
      digitoaux = numero2 % 10;
      resultado = resultado * 10 + digitoaux;
      numero2 /= 10;
    }

    System.out.println(resultado);
  }
}
