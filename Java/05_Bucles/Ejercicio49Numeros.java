import java.util.Scanner;

public class Ejercicio49Numeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido;
    int divisores = 0;

    int maximo = 0;
    int minimo = Integer.MAX_VALUE;
    int cuentaNumeros = 0;
    double suma = 0;
    double media;

    System.out.println(maximo);
    System.out.println(minimo);

    System.out.println("Introduce numeros positivos, para parar introduce un numero primo:");

    while (divisores != 2) {

      numeroIntroducido = s.nextInt();

      /*
      if (cuentaNumeros == 0){
        minimo = numeroIntroducido;
      }*/

      divisores = 0;

      for (int i = 1; i <= numeroIntroducido; i++) {

        if ((numeroIntroducido % i) == 0){
          divisores++;
        }
        
      }//For

      if (divisores != 2){

        if (numeroIntroducido > maximo){
          maximo = numeroIntroducido;
        }else if (numeroIntroducido < minimo){
          minimo = numeroIntroducido;
        }

        suma += numeroIntroducido;
        cuentaNumeros++;
      }//If


    }//While

    media = suma / cuentaNumeros;

    System.out.println("Media: " + media);
    System.out.println("Maximo: " + maximo);
    System.out.println("Minimo: " + minimo);

    s.close();
  }
}
