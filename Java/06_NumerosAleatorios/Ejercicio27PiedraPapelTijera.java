import java.util.Scanner;

public class Ejercicio27PiedraPapelTijera {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroAleatorio;
    String resultado = "Gana el ordenador";
    String jugador;
    String maquina;

    System.out.print("Turno del judador (piedra, papel, tijera): ");
    jugador = s.nextLine();

    s.close();

    numeroAleatorio = (int) (Math.random() * 3);

    switch (numeroAleatorio) {
      case 0:
        maquina = "papel";
        break;
      case 1:
        maquina = "piedra";
        break;
      case 2:
        maquina = "tijera";
        break;
      default:
        maquina = " ";
        break;
    }//Switch

    System.out.println("Turno del ordenador: " + maquina);

    if (jugador.equals(maquina)) resultado = "empate";
    else if ((maquina == "papel" && jugador == "tijera") || (maquina == "tijera" && jugador == "piedra") || (maquina == "piedra" && jugador == "papel")) resultado = "Gana el jugador";

    System.out.println(resultado);

  }
}
