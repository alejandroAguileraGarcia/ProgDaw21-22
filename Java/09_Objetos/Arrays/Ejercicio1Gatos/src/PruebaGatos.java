import java.util.Scanner;
import objetos.Gato;

public class PruebaGatos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Gato[] gatos = new Gato[2];

    System.out.println("Introduce los datos: ");

    for (int i = 0; i < 2; i++) {
      gatos[i] = new Gato();
      System.out.println("Nombre");
      gatos[i].setNombre(s.nextLine());
      System.out.println("Sexo");
      gatos[i].setSexo(s.nextLine());
      System.out.println("Color");
      gatos[i].setColor(s.nextLine());
    }

    s.close();

    System.out.println("Datos: ");

    for (int i = 0; i < 2; i++) {
      /*
      System.out.println("Gato: " + (i + 1));
      System.out.println("Nombre: " + gatos[i].getNombre());
      System.out.println("Color: " + gatos[i].getColor());
      System.out.println("Sexo: " + gatos[i].getSexo());
      */
      System.out.println("Gato: " + (i + 1));
      System.out.println(gatos[i]);
    }

  }
}
