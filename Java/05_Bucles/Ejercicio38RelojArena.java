import java.util.Scanner;

public class Ejercicio38RelojArena {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int altura = 0;
    int espaciosDelanteros = 0;
    int relleno = 0;

    System.out.println("Introduce la altura de la X: ");
    altura = s.nextInt();

    if (((altura % 2) != 0) && (altura >= 3)){
      relleno = altura;

      for (int i = 0; i < altura; i++) {
        for (int j = 0; j < espaciosDelanteros; j++) {
          System.out.print(" ");
        }

        for (int j = 0; j < relleno; j++) {
          System.out.print("*");
        }

        System.out.println();

        if (i < (altura / 2)) {
          espaciosDelanteros++;
          relleno -= 2;
        }else{
          espaciosDelanteros--;
          relleno += 2;
        }
        
      }
    }else{
      System.out.println("Altura invalida");
    }
    s.close();
  }
}