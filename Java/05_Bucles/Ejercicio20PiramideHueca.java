import java.util.Scanner;

public class Ejercicio20PiramideHueca {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int h;
    int numeroEspacios = 0;
    int numeroEspaciosInteriores = 0;
    char c = '*';

    System.out.print("Introduce la altura de la piramide: ");
    h = s.nextInt();

    System.out.print("Introduce un caracter para dibujar la piramide: ");
    c = s.next().charAt(0);

    numeroEspacios = h-1;
    for (int i = 1; i < h; i++){

      /*Introducir espacios*/
      for(int j = 1; j <= numeroEspacios; j++){
        System.out.print(" ");
      }

      /*Introducir caracteres*/
      System.out.print(c);

      for(int k = 1; k < numeroEspaciosInteriores; k++){
        System.out.print(" ");
      }

      if (i>1){
        System.out.print(c);
      }

      System.out.println();

      numeroEspacios--;
      numeroEspaciosInteriores += 2;
    }

    /*Base piramide*/
    for(int i = 0; i < h; i++){
      System.out.print(c+" ");
    }

    s.close();
  }
}