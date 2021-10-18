import java.util.Scanner;

public class Ejercicio31Ele {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int altura;

    System.out.print("Introduce la altura de la L: ");
    altura = s.nextInt();

    for (int i = 1; i < altura; i++){
      System.out.println("*");
    }

    for (int i = 0; i < ((altura/2)+1); i++){
      System.out.print("* ");
    }

    s.close();
  }
}
