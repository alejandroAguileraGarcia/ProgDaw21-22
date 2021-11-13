import java.util.Scanner;

public class Ejercicio04Cortos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int nMayor;
    int nMenor;
    int salto;
    
    System.out.print("Introduce el numero mas alto: ");
    nMayor = s.nextInt();

    System.out.print("Introduce el numero menor: ");
    nMenor = s.nextInt();

    System.out.print("Introduce el salto: ");
    salto = s.nextInt();

    s.close();

    for(int i = nMayor; i >= nMenor; i -= salto) {
      System.out.printf("%d ", i);
    }
    
  }
}
