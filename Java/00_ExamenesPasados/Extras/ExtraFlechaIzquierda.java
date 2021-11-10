import java.util.Scanner;

public class ExtraFlechaIzquierda {
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

    espacios = grosor/2 + 1;

    s.close();

    for (int i = 0; i < (grosor + 2); i++){
      for (int j = 0; j < espacios; j++){
        System.out.print(" ");
      }

      for (int j = 0; j < relleno; j++){
        System.out.print("*");
      }

      if ((i > 0) && (i < (grosor+1))){
        for (int j = 0; j < (longitudIntroducida - (2 + grosor/2)); j++){
          System.out.print("*");
        }
      }

      System.out.println();

      if (i < (1 + grosor / 2)){
        espacios--;
        relleno++;
      }else{
        espacios++;
        relleno--;
      }//Espacios

    }//For altura

  }
}
