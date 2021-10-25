import java.util.Scanner;

public class Ejercicio61V {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int espaciosDelanteros = 0;
    int espaciosDentro;

    boolean error = false;
    
    System.out.print("Introduce la altura de la piramide: ");
    altura= s.nextInt();
    
    s.close();

    if (altura < 3){
      error = true;
    }

    if (!error){

      espaciosDentro = (altura - 1) * 2;

      for (int i = 1; i <= altura; i++){

        for (int j = 1; j <= espaciosDelanteros; j++){

          System.out.print(" ");
  
        }

        if (i != altura){

          System.out.print("***");

          for (int j = 1; j <= espaciosDentro; j++){

            System.out.print(" ");

          }

          System.out.print("***");

        }else{
          
          System.out.print("******");

        }

        System.out.println();
        espaciosDelanteros++;
        espaciosDentro -= 2;

      }

    }else{

      System.out.println("La altura debe ser mayor o igual a 3.");
    
    }

  }
}
