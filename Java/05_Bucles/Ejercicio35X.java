import java.util.Scanner;

public class Ejercicio35X {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int altura = 0;
    int espacios = 0;
    int espaciosDelanteros = 0;

    System.out.println("Introduce la altura de la X: ");
    altura = s.nextInt();

    if (((altura % 2) != 0) && (altura >= 3)){
      espacios = altura-2;

      for (int i = 0; i < altura; i++) {
        for (int j = 0; j < espaciosDelanteros; j++) {
          System.out.print(" ");
        }
        
        if (i != (altura/2)){
        System.out.print("*");
        }

        for (int j = 0; j < espacios; j++) {
          System.out.print(" ");
        }
        
        System.out.println("*");

        if (i < (altura / 2)) {
          espaciosDelanteros++;
          espacios = espacios-2;
        }else{
          espaciosDelanteros--;
          espacios = espacios+2;
        }
        
      }
    }else{
      System.out.println("Altura invalida");
    }
    s.close();
  }
}
