import java.util.Scanner;

public class Ejercicio28PiedraPapelTijera {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int ganador=0;

    String j1="";
    String j2="";

    System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
    j1 = s.nextLine();
    System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
    j2 = s.nextLine();


    switch (j1) {
      case "papel":
        switch (j2){
          case "papel":
            ganador=3;
            break;
          case "tijera":
            ganador=2;
            break;
          case "piedra":
            ganador=1;
            break;
          default:
            break;
        }break;
      case "piedra":
        switch (j2){
          case "papel":
            ganador=2;
            break;
          case "tijera":
            ganador=1;
            break;
          case "piedra":
            ganador=3;
            break;
          default:
            break;
        }break;
      case "tijera":
        switch (j2){
          case "papel":
            ganador=1;
            break;
          case "tijera":
            ganador=3;
            break;
          case "piedra":
            ganador=2;
            break;
          default:
            break;
        }break;
      default:
        break;
    }

    if (ganador==0){
      System.out.println("Jugada invalida");
    }else if (ganador==1){
      System.out.println("Ha ganado el jugador uno");
    }else if (ganador==2){
      System.out.println("Ha ganado el jugador dos");
    }else if(ganador==3){
      System.out.println("Empate");
    }


    s.close();
  }
}
