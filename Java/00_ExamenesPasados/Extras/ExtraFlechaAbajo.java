import java.util.Scanner;

public class ExtraFlechaAbajo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int grosor;
    int longitudIntroducida;
    int relleno;
    int espacios = 0;

    System.out.print("Introduce el grosor de la flecha: ");
    grosor = s.nextInt();

    System.out.print("Introduce la longitud de la flecha: ");
    longitudIntroducida = s.nextInt();

    relleno = grosor + 2;

    s.close();

    for (int i = 0; i < (longitudIntroducida - (2 + grosor/2)); i++) {

      System.out.print(" ");

      for (int j = 0; j < grosor; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }

    for(int i = 0; i < (2 + grosor/2); i++) {

      for(int j = 0; j < espacios; j++){
        System.out.print(" ");
      }

      for(int j = 0; j < relleno; j++){
        System.out.print("*");
      }

      System.out.println();
      relleno -= 2;
      espacios++;
    }

  }
}
