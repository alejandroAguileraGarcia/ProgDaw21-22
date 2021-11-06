import java.util.Scanner;

public class Ejercicio4Alargar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int factor;
    int longitud = 0;
    int digito;

    String numeroImpreso = "";

    do{

      System.out.print("Introduce un numero: ");
      numero = s.nextInt();

      if (numero == 0){
        System.out.print("El numero cero no vale. ");
      }

    } while (numero == 0);

    if (numero < 0){

      System.out.println("Has introducido un número negativo, se considerara positivo.");
      numero = -numero;

    }

    do{

      System.out.print("Introduce el factor de estiramiento: ");
      factor = s.nextInt();

      if (factor <= 0) System.out.println("No acepto estiramientos nulos ni negativos.");

    } while (factor <= 0);

    s.close();

    for (int i = numero; i > 0; i /= 10) longitud++;

    for (int i = longitud - 1; i >= 0; i--){

      digito = numero / (int) Math.pow(10, i);
      
      for (int j = 0; j < factor; j++) numeroImpreso += digito;

      numero %= (int) Math.pow(10, i);

    }

    System.out.println(numeroImpreso);

  }
}
