import java.util.Scanner;

public class Ejercicio20Reyes {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n;

    System.out.println("¿Cuantos reyes quieres insertar?: ");
    n = s.nextInt();

    String[] reyes = new String[n];

    System.out.println("Vaya introduciendo los reyes seguido de intro:");
    s.nextLine();
    for (int i = 0; i < n; i++) reyes[i] = s.nextLine();

    s.close();

    System.out.println("Los reyes introducidos son: ");
    
    for (int i = 0; i < n; i++) {

      int orden = 1;

      for (int j = 0; j < i; j++) if (reyes[i].equals(reyes[j])) orden++;
      
      System.out.println(reyes[i] + " " + orden);
    }
  }
}
