import java.util.Scanner;

public class Ejercicio4Codificacion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero;
    int numeroIntroducido;
    int digito;
    
    char caracter;
    String numeroCodificado;

    do{
      System.out.print("Introduce un numero entero: ");
      numeroIntroducido =s.nextInt();

      numero = numeroIntroducido;
      numeroCodificado = "";

      if (numero != 0){

        while (numero > 0){

          digito = numero % 10;
          numero /= 10;

          switch (digito) {
            case 1:
              caracter = 'l';
              break;
            case 2:
              caracter = 'Z';
              break;
            case 3:
              caracter = 'E';
              break;
            case 4:
              caracter = 'A';
              break;
            case 5:
              caracter = 'S';
              break;
            case 6:
              caracter = 'b';
              break;
            case 7:
              caracter = 'J';
              break;
            case 8:
              caracter = 'B';
              break;
            case 9:
              caracter = 'g';
              break;
            default:
              caracter = 'O';
              break;
          }

          numeroCodificado = caracter + numeroCodificado;

        }

      }//If

      System.out.println("El valor codificado es: " + numeroCodificado);

    }while (numeroIntroducido != 0);

    s.close();
  }
}
