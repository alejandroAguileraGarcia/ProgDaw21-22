import java.util.Scanner;

public class Ejercicio46Rectangulo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int anchura;
    int altura;

    System.out.print("Introduce la altura del rectangulo (min 2): ");
    altura = s.nextInt();
    System.out.print("Introduce la anchura del rectangulo (min 2): ");
    anchura = s.nextInt();

    s.close();

    if ((altura >= 2)&&(anchura >= 2)){
      for (int i = 0; i < anchura; i++){
        System.out.print("* ");
      }
  
      System.out.println();
  
      for (int j = 0; j < (altura - 2); j++){
        System.out.print("* ");
  
        for (int i = 0; i < (anchura - 2); i++){
          System.out.print("  ");
        }
  
        System.out.println("*");
      }
  
      for (int i = 0; i < anchura; i++){
        System.out.print("* ");
      }
    }else {
      System.out.println("Datos erroneos");
    }
    

  }
}
