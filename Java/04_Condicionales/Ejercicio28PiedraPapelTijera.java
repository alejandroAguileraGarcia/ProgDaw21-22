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

    if (j1.equals(j2)){
      ganador = 3;
    }else{
      switch (j1) {
        case "papel":
          if (j2.equals("tijera")){
            ganador=2;
          }else if (j2.equals("piedra")){
            ganador=1;
          }
          break;
        case "piedra":
          if (j2.equals("papel")){
            ganador=2;
          }else if (j2.equals("tijera")){
            ganador=1;
          }
          break;
        case "tijera":
          if (j2.equals("piedra")){
            ganador=2;
          }else if (j2.equals("papel")){
            ganador=1;
          }
          break;
        default:
          break;
      }}

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
