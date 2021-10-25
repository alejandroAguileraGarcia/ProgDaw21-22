import java.util.Scanner;

public class Ejercicio53Figura {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;

    System.out.print("Introduce la altura de la figura: ");
    altura = s.nextInt();

    s.close();

    for (int i = altura; i > 0; i--){

      for (int j = altura; j > 0; j--){
        System.out.print("*");
      }

      System.out.println();
      
      altura--;
    }//For altura
    
  }
}
