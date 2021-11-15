import java.util.Scanner;

public class Ejercicio15Mesas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroComensales;
    int [] mesas = new int[10];
    boolean salir;

    for (int i = 0; i < 10; i++) mesas[i] = (int) (Math.random() * 5);

    do {

      System.out.printf("%-12s", "Mesa nº:");

      for (int i = 1; i <= 10; i++) System.out.printf("%3d",i);

      System.out.println();

      System.out.printf("%-12s", "Ocupación:");

      for (int i = 0; i < 10; i++) System.out.printf("%3d",mesas[i]);

      System.out.println();

      System.out.print("¿Cuantos son? (-1 para salir): ");
      numeroComensales = s.nextInt();

      int i = 0;

      if (numeroComensales < 5) {
        do {

          salir = false;
          
          if (mesas[i] + numeroComensales <= 4){
            salir = true;
            mesas[i] += numeroComensales;
          }else if (!salir) i++;
          

        } while(!salir && i < 10);

        if (salir == false) System.out.println("Lo siento no tenemos mesa");
        else System.out.println("Por favor sientese en la mesa " + (i + 1));
        
      }else System.out.println("Haga grupos de 4 personas como máximo e intente de nuevo");

    }while (numeroComensales != -1);

    s.close();
  }
}