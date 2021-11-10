import java.util.Scanner;

public class ExtraFlechaArriba {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int grosor;
    int longitudIntroducida;
    int relleno = 1;
    int espacios;

    System.out.print("Introduce el grosor de la flecha: ");
    grosor = s.nextInt();

    System.out.print("Introduce la longitud de la flecha: ");
    longitudIntroducida = s.nextInt();

    espacios = 1 + grosor/2;

    s.close();

    for(int i = 0; i < (2 + grosor/2); i++) {

      for(int j = 0; j < espacios; j++){
        System.out.print(" ");
      }

      for(int j = 0; j < relleno; j++){
        System.out.print("*");
      }

      System.out.println();
      relleno += 2;
      espacios--;
    }

    for (int i = 0; i < (longitudIntroducida - (2 + grosor/2)); i++) {

      System.out.print(" ");

      for (int j = 0; j < grosor; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }

  }
}
