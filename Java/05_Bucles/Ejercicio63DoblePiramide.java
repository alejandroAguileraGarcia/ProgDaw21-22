import java.util.Scanner;

public class Ejercicio63DoblePiramide {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int alturaMayor;
    int alturaMenor;

    int altura1;
    int asteriscos1 = 0;

    int altura2;
    int asteriscos2 = 1;

    int espaciosDelanteros;
    int espaciosMedio;
    int espaciosPrimero;

    System.out.print("Introduce la altura de la primera piramide: ");
    altura1 = s.nextInt();

    System.out.print("Introduce la altura de la segunda piramide: ");
    altura2 = s.nextInt();

    s.close();

    if (altura1 > altura2) {
      alturaMayor = altura1;
      alturaMenor = altura2;
    }else{
      alturaMayor = altura2;
      alturaMenor = altura1;
    }

    espaciosDelanteros = alturaMayor - 1;
    espaciosMedio = (altura1 - 1) * 2 + 1 + altura2;

    for (int i = 1; i <= alturaMayor; i++){

      for (int j = 1; j <= espaciosDelanteros; j++){

        System.out.print(".");

      } //For espacios delanteros

      if (i == (alturaMayor - alturaMenor)){

        
      
      }

      if (i > (altura2 - altura1)){

        asteriscos1 = 1 + (i - altura2 + altura1 - 1) * 2;

        for ( int j = 1; j <= asteriscos1; j++){

          System.out.print("*");

        }//For asteriscos primera piramide


      }//If

      for (int j = 1; j <= (espaciosMedio - espaciosDelanteros - asteriscos1 - asteriscos2 + 1); j++){

        System.out.print(".");

      }

      for (int j = 1; j <= asteriscos2; j++){

        System.out.print("*");

      }

      System.out.println();

      espaciosDelanteros--;
      asteriscos2 += 2;
      
      espaciosMedio++; 
    }//For altura total

  }

}