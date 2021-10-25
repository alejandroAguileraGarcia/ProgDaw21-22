import java.util.Scanner;

public class Ejercicio56Figura2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int asteriscos;
    int espacios = 0;

    System.out.print("Introduce la altura: ");
    altura = s.nextInt();

    s.close();

    asteriscos = altura;

    for (int i = 0; i < altura; i++){

      for (int j = 0; j < espacios; j++){
        System.out.print(" ");
      }

      for (int j = 0; j < asteriscos; j++){
        System.out.print("*");
      }

      System.out.println();

      espacios++;
      asteriscos--;
      
    }//For altura

  }
}
