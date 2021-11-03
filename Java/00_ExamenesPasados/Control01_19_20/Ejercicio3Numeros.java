import java.util.Scanner;

public class Ejercicio3Numeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroIntroducido;
    int numero;
    int parteDesplazada;

    int longitud = 0;
    int cifras = 0;

    String desplazamiento;

    System.out.print("Introduce un numero: ");
    numeroIntroducido = s.nextInt();

    s.nextLine();

    numero = numeroIntroducido;

    while (numero > 0){

      longitud++;
      numero /= 10;

    }//While longitud 

    numero = numeroIntroducido;

    do {

      System.out.print("Introduzca el tipo de desplazamiento (izquierda, derecha, salir): ");
      desplazamiento = s.nextLine();

      if ((desplazamiento.equals("izquierda"))||(desplazamiento.equals("derecha"))){

        System.out.print("Introduce la cantidad de cifras que desea desplazar: ");
        cifras = s.nextInt();

        s.nextLine();

        if (cifras > longitud){

          cifras -= longitud;
    
        }//If cifras

      }//If !desplazamiento.equals("salir")

      if (desplazamiento.equals("izquierda")){

        parteDesplazada = numero / (int) Math.pow(10, (longitud - cifras));

        numero %= (int) Math.pow(10, (longitud - cifras));

        numero = numero * (int) Math.pow(10, cifras) + parteDesplazada;

        System.out.println(numero);

      }else if (desplazamiento.equals("derecha")){//If izquierda

        parteDesplazada = numero  / (int) Math.pow(10, cifras);

        numero %= (int) Math.pow(10, cifras);

        numero = numero * (int) Math.pow(10, (longitud - cifras)) + parteDesplazada;

        System.out.println(numero);
      
      }//If derecha

    }while (!desplazamiento.equals("salir"));

    s.close();

  }
}
