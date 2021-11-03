import java.util.Scanner;

public class Ejercicio1Gusano {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    char entrada;
    int numeroEspacios = 0;

    System.out.println("Este programa dibuja un gusano en la pantalla");
    System.out.println("Controles: j=abajo-izquierda // k = abajo // l=abajo-derecha (seguido de Enter)");
    System.out.println("Para salir, pulse 's' ");

    do {
      
      for (int i = 1; i <= numeroEspacios; i++){
        System.out.print(" ");
      }

      System.out.print("*");

      for (int i = numeroEspacios; i < 20; i++){
        System.out.print(" ");
      }

      System.out.print("¿j,k,l,s?: ");
      entrada = s.next().charAt(0);

      switch (entrada) {
        case 'j':
          if (numeroEspacios > 0){
            numeroEspacios--;
          }
          break;
        case 'l':
          if (numeroEspacios < 9){
            numeroEspacios++;
          }
          break;
        default:
          break;
      }

      

    } while (entrada != 's');

    s.close();

  }
}
