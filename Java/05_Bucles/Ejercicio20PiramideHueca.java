import java.util.Scanner;

public class Ejercicio20PiramideHueca {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int h;
    int numeroEspacios = 0;
    int numeroCaracteres = 1;
    char c = '*';

    System.out.print("Introduce la altura de la piramide: ");
    h = s.nextInt();

    System.out.print("Introduce un caracter para dibujar la piramide: ");
    c = s.next().charAt(0);

    numeroEspacios = h-1;
    for (int i = 0; i < h; i++){

      /*Introducir espacios*/
      for(int j = 1; j <= numeroEspacios; j++){
        System.out.print(" ");
      }
      /*
      for(int j = numeroEspacios; j >= 0; j--){
        System.out.print(" ");
      }*/

      /*Introducir caracteres*/
      for(int k = 1; k <= numeroCaracteres; k++){
        System.out.print(c);
      }

      System.out.print("\n");

      numeroEspacios--;
      numeroCaracteres = numeroCaracteres + 2;
    }
    

    s.close();
  }
}