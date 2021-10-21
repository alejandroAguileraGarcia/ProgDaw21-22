import java.util.Scanner;

public class Ejercicio33U {
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);

    int altura;

    System.out.print("Introduce la altura de la U: ");
    altura = s.nextInt();

    for (int i = 1; i < altura; i++){
      System.out.print("* ");
      for (int k = 0; k < altura; k++){
        System.out.print(" ");
      }
      System.out.println(" *");
    }

    for (int i = 0; i < ((altura/2)+1); i++){
      System.out.print(" *");
    }
    
    s.close();
  }
}
