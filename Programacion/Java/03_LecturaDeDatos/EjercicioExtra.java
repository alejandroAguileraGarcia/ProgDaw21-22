import java.util.Scanner;

public class EjercicioExtra {
  public static void main(String[] args) {   
    Scanner s = new Scanner(System.in);

    String frase="";

    System.out.print("Introduce una frase");
    frase= frase+ s.nextLine()+ "\n";

    System.out.print("Introduce una frase");
    frase= frase+ s.nextLine()+ "\n";

    System.out.print("Introduce una frase");
    frase= frase+ s.nextLine()+ "\n";

    System.out.print("Introduce una frase");
    frase= frase+ s.nextLine()+ "\n";

    System.out.print("Introduce una frase");
    frase= frase+ s.nextLine()+ "\n";

    System.out.println(frase);
    s.close();
  }
}