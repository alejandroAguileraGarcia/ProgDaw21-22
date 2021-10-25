import java.util.Scanner;

public class Ejercicio69PiramideMaya {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int espaciosDelanteros;
    int asteriscos = 1;

    System.out.print("Introduce la altura de la piramide: ");
    altura = s.nextInt();

    s.close();

    espaciosDelanteros = altura - 1;

    for (int i = 1; i <= altura; i++) {
      
      for (int j = 1; j <= espaciosDelanteros; j++){
        System.out.print(" ");
      }

      for (int j = 1; j <= asteriscos; j++){
        System.out.print("*");
      }

      if (i % 2 == 0) {

        System.out.print("    ");

      }else{

        System.out.print("****");

      }

      for (int j = 1; j <= asteriscos; j++){
        System.out.print("*");
      }

      System.out.println();

      asteriscos ++;
      espaciosDelanteros--;
    }

  }
}
