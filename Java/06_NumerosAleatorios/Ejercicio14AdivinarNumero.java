import java.util.Scanner;

public class Ejercicio14AdivinarNumero {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String lectura;
    int oportunidades = 5;
    int numeroAleatorio;
    int mayor = 0;
    int menor = 101;

    do {

      numeroAleatorio = (int) (Math.random() * (menor - mayor) + mayor);
      numeroAleatorio += numeroAleatorio == mayor && oportunidades != 5 ? 1 : numeroAleatorio == menor ? -1 : 0;

      System.out.printf("¿Es %s? (S/M/m)", numeroAleatorio);
      lectura = s.nextLine();

      oportunidades--;

      if (!lectura.equals("S")){
        
        if (lectura.equals("M")) mayor = numeroAleatorio;
        else if (lectura.equals("m")) menor = numeroAleatorio;

      }


    } while(oportunidades > 0 && !lectura.equals("S"));

    s.close();
  }
}
