import java.util.Scanner;

public class Ejercicio66FlechaGC {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int espaciosDelanteros = 0;

    System.out.print("Introduce un numero: ");
    altura = s.nextInt();
    s.close();

    for (int i = 0; i < altura; i++){

      for (int j = 0; j < espaciosDelanteros; j++) {
        System.out.print(" ");
      }

      System.out.println("*    *");

      if (i < (altura / 2)){
        espaciosDelanteros++;
      }else{
        espaciosDelanteros--;
      }

    }//FOR

  }
}
