import java.util.Scanner;

public class Ejercicio57Figura2Hueca {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int espaciosDelanteros = 0;
    int espaciosInteriores;

    System.out.print("Introduce la altura de la figura: ");
    altura = s.nextInt();

    s.close();

    espaciosInteriores = altura;

    for (int i = 1; i <= altura; i++){

      for (int j = 0; j < espaciosDelanteros; j++){
        System.out.print(" ");
      }

      System.out.print("*");

      if (i==1){

        for (int j = 1; j < altura; j++){
          System.out.print("*");
        }

        System.out.println();

      }else if (i != altura){

        for (int j = 0; j < (espaciosInteriores -2); j++){
          System.out.print(" ");
        }
  
        System.out.println("*");

      }

      espaciosDelanteros++;
      espaciosInteriores--;
      
    }//For altura

  }
}
