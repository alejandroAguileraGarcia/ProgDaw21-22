import java.util.Scanner;

public class Ejercicio07CajaFuerte {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

  int combinacion=1234;
  int entrada=0;
  int i=0;

    do{
      System.out.println("Introduce la combinacion de la caja fuerte: ");
      entrada = s.nextInt();
      i++;
    }while((entrada!=combinacion)&&(i<4));
  s.close();
  }
}
