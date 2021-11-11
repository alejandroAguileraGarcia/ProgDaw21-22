import java.util.Scanner;

public class Ejercicio31Apuesta {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int cantidad;
    int juego = 0;
    int Dado1;
    int Dado2;
    int suma;
    int sumaAux = 0;
    boolean acabar = false;

    System.out.print("Introduce la cantidad de dinero que quieres apostar: ");
    cantidad = s.nextInt();

    do {

      Dado1 = (int) (Math.random() * 6) + 1;
      Dado2 = (int) (Math.random() * 6) + 1;

      System.out.println("Dado 1: " + Dado1);
      System.out.println("Dado 2: " + Dado2);
      

      suma = Dado1 + Dado2;

      if (juego == 0){

        switch (suma) {
          case 7:
          case 11:
            cantidad *= 2;
            acabar = true;
            break;
          case 2:
          case 3:
          case 12:
            cantidad = 0;
            acabar = true;
            break;
          default:
            break;
        } //Switch

      } else {
        if (suma == 7) acabar = true;
        else if (suma == sumaAux){
          cantidad *= 2;
          acabar = true;
        }
      }

      sumaAux = suma;

      juego++;

    } while (!acabar);

    System.out.println("Tu cantidad final es: " + cantidad);
  }
}
