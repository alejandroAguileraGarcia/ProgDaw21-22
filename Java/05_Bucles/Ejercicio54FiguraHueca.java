import java.util.Scanner;

public class Ejercicio54FiguraHueca {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int alturaIntroducida;

    System.out.print("Introduce la altura de la figura: ");
    alturaIntroducida = s.nextInt();

    s.close();

    altura = alturaIntroducida;
    for (int i = altura; i > 0; i--){

      System.out.print("*");

      if (i == alturaIntroducida) {

        for (int j = altura; j > 1; j--){
          System.out.print("*");
        }

        System.out.println();

      }else if (i != 1) {

        for (int j = altura; j > 2; j--){
          System.out.print(" ");
        }
        
        System.out.println("*");

      }
      
      altura--;
    }//For altura
    
  }
}