import java.util.Scanner;

public class Ejercicio06Adivinar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroAleatorio;
    int numeroUsuario;
    int oportunidades = 5;

    numeroAleatorio = (int) (Math.random() * 101);

    do {

      System.out.print("Introduce un número: ");
      numeroUsuario = s.nextInt();

      oportunidades--;

      if (oportunidades > 0 && numeroUsuario != numeroAleatorio) System.out.println(numeroAleatorio < numeroUsuario ? "El numero aleatorio es menor" : "El numero aleatorio es mayor");
      
      
    } while (oportunidades > 0 && numeroAleatorio != numeroUsuario);

    if (numeroAleatorio == numeroUsuario) System.out.println("Enhorabuena");
    else System.out.println("Lo siento, se te han acabado las oportunidades");

    s.close();
  }

}
