import java.util.Scanner;

public class Ejercicio65A {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int h;
    int hPalo;
    int numeroEspacios = 0;
    int numeroEspaciosInteriores = 0;

    boolean error = false;

    System.out.print("Introduce la altura (>= 3): ");
    h = s.nextInt();

    System.out.printf("Introduce la fila del palo (entre 2 y %d): ", (h-1));
    hPalo = s.nextInt();

    if ((h < 3)||(hPalo < 2)||(hPalo > (h-1))){
      error = true;
    }

    numeroEspacios = h-1;

    if (!error){
      for (int i = 1; i <= h; i++){

        for(int j = 1; j <= numeroEspacios; j++){
          System.out.print(" ");
        }

        if (i != hPalo){
            System.out.print("*");

          for(int k = 1; k < numeroEspaciosInteriores; k++){
            System.out.print(" ");
          }

          if (i>1){
            System.out.print("*");
          }

        }else{

          for(int k = 1; k < (numeroEspaciosInteriores + 2); k++){
            System.out.print("*");
          }

        }

        System.out.println();

        numeroEspacios--;
        numeroEspaciosInteriores += 2;
      }//FOR

    }else{
      System.out.println("Datos erroneos");
    }

    s.close();
  }
}
