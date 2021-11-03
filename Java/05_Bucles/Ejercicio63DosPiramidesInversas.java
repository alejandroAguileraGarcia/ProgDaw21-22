import java.util.Scanner;

public class Ejercicio63DosPiramidesInversas {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura1;
    int altura2;

    int alturaMayor;

    int asteriscos1;
    int asteriscos2;

    int espaciosDelanteros = 0;
    int espaciosMedio;

    System.out.print("Introduce la altura de la primera pirámide: ");
    altura1 = s.nextInt();

    System.out.print("Introduce la altura de la segunda piramide: ");
    altura2 = s.nextInt();

    s.close();

    espaciosMedio = 1;
    asteriscos1 = (altura1 -  1) * 2 + 1;   
    asteriscos2 = (altura2 -  1) * 2 + 1;

    if (altura1 >= altura2){

      alturaMayor = altura1;

    }else{

      alturaMayor = altura2;

    }

    for (int i = 0; i < alturaMayor; i++) {

      for (int j = 1; j <= espaciosDelanteros; j++){

        System.out.print(" ");

      } //For espacios delanteros

      if (altura1 > altura2){

        for (int j = 1; j <= asteriscos1; j++){

          System.out.print("*");

        } //For primera piramide

        asteriscos1 -= 2;

      }//If primera piramide

      if (altura1 > altura2){

        espaciosMedio += 2;

      }

      for (int j = 1; j <= espaciosMedio; j++){

        System.out.print(" ");

      } //For espacios medio

      if (altura1 > altura2){

        for (int j = 1; j <= asteriscos2; j++){

          System.out.print("*");
  
        } //For segunda piramide

        asteriscos2 -= 2;

      }

      System.out.println();

      espaciosDelanteros++;

    }//For altura

  }
}
