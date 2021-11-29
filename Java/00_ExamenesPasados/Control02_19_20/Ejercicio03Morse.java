import java.util.Scanner;

public class Ejercicio03Morse {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroIntroducido;
    int digito;
    String numeroIntroducidoMorse;
    String morse;

    do {
      morse = "";

      System.out.print("Introduce un número: ");
      numeroIntroducido = s.nextInt();

      if (numeroIntroducido >= 0) {
        do {
          digito = numeroIntroducido % 10;
          switch (digito) {
            case 1:
              numeroIntroducidoMorse = ".---- ";
              break;
            case 2:
              numeroIntroducidoMorse = "..--- ";
              break;
            case 3:
              numeroIntroducidoMorse = "...-- ";
              break;
            case 4:
              numeroIntroducidoMorse = "....- ";
              break;
            case 5:
              numeroIntroducidoMorse = "..... ";
              break;
            case 6:
              numeroIntroducidoMorse = "-.... ";
              break;
            case 7:
              numeroIntroducidoMorse = "--... ";
              break;
            case 8:
              numeroIntroducidoMorse = "---.. ";
              break;
            case 9:
              numeroIntroducidoMorse = "----. ";
              break;
            case 0:
              numeroIntroducidoMorse = "----- ";
              break;
            default:
              numeroIntroducidoMorse = "";
              break;
          }

          morse = numeroIntroducidoMorse + morse;
          numeroIntroducido /= 10;

        } while (numeroIntroducido > 0); 

        System.out.println(morse);

      }

    } while (numeroIntroducido >= 0);

    s.close();

  }
}