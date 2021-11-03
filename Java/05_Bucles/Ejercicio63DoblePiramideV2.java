import java.util.Scanner;

public class Ejercicio63DoblePiramideV2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura1;
    int altura2;

    int alturaMayor;

    int asteriscos1 = 1;
    int asteriscos2 = 1;

    int espaciosDelanteros;
    int espaciosMedio;

    System.out.print("Introduce la altura de la primera pirámide: ");
    altura1 = s.nextInt();

    System.out.print("Introduce la altura de la segunda piramide: ");
    altura2 = s.nextInt();

    s.close();

    espaciosMedio = altura1*2;

    if (altura1 >= altura2){

      alturaMayor = altura1;
      espaciosMedio++;

    }else{

      alturaMayor = altura2;

    }
    
    espaciosDelanteros = alturaMayor - 1;

    for (int i = 0; i < alturaMayor; i++) {

      for (int j = 1; j <= espaciosDelanteros; j++){

        System.out.print(" ");

      } //For espacios delanteros

      if (i >= (altura2 - altura1)||(altura1 > altura2)){

        for (int j = 1; j <= asteriscos1; j++){

          System.out.print("*");

        } //For primera piramide

        asteriscos1 += 2;

      }//If primera piramide

      if (i == (altura2 - altura1)&&(altura2 > altura1)){

        espaciosMedio--;

      }else if(i > (altura2 - altura1)||(altura1 > altura2)){
        
        espaciosMedio -= 2;

      }

      for (int j = 1; j <= espaciosMedio; j++){

        System.out.print(" ");

      } //For espacios medio

      if (i >= (altura1 - altura2)){

        for (int j = 1; j <= asteriscos2; j++){

          System.out.print("*");
  
        } //For segunda piramide

        asteriscos2 += 2;

      }

      System.out.println();

      espaciosDelanteros--;

    }//For altura

  }
}
