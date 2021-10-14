import java.util.Scanner;

public class Ejercicio27Multiplos3 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    int numeroIntroducido = 0;

    System.out.print("Introduce un numero entero: ");
    numeroIntroducido = s.nextInt();

    for (int i = 3; i <= numeroIntroducido; i = i + 3){
      System.out.print(i + "\t");
    }

    s.close();
  }
}
