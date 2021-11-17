import java.util.Scanner;

public class Ejercicio08Temperatura {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String caracter;

    String[]  mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    int[] temperatura = new int[12];
    
    System.out.print("Introduce el caracter con el que dibujar el diagrama de barras: ");
    caracter = s.nextLine();

    for (int i = 0; i < 12; i++) {

      System.out.printf("Introduce la temperatura de %s: ", mes[i]);
      temperatura[i] = s.nextInt();

    }

    s.close();

    for (int i = 0; i < 12; i++){

      System.out.print(mes[i] + ":");

      for (int j = 0; j < temperatura[i]; j++) System.out.print(caracter);
      
      System.out.println();
    }

  }
}