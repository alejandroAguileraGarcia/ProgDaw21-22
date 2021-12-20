/*Alejandro Aguilera García*/

import java.util.Scanner;

public class Ex01aag4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int ancho;
    int alto;
    int espacios = 4;
    int relleno = 1;

    System.out.print("Indique el ancho en triángulos: ");
    ancho = s.nextInt();

    System.out.print("Indique el alto en triángulos: ");
    alto = s.nextInt();

    s.close();

    for (int i = 1; i <= alto; i++) {
      System.out.println();

      espacios = 4;
      relleno = 1;

      for (int j = 1; j <= 4; j++) {

        for (int z = 1; z <= ancho; z++){

          if (z == 1){
            for (int k = 1; k <= espacios - 1; k++) {
              System.out.print(" ");
            }
          } else {
            for (int k = 1; k <= espacios; k++) {
              System.out.print(" ");
            }
          }
  
          for (int k = 1; k <= relleno; k++) {
            System.out.print("*");
          }
          
        }
        espacios--;
        relleno++;
        System.out.println();

      }

    }

  }
}
