import java.util.Scanner;

public class Ejercicio14Colores {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String palabras[] = new String[8];

    String colores[] = new String[8];
    int cantColores = 0;

    String resto[] = new String[8];
    int cantResto = 0;
    
    String coloresAlmacenados[] = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    for (int i = 0; i < 8; i++) {

      int cantidadInicial = cantColores;

      System.out.print("Introduce una palabra: ");
      palabras[i] = s.nextLine();
      
      for (int j = 0; j < 9; j++) {

        if (palabras[i].equals(coloresAlmacenados[j])) {

          colores[cantColores] = palabras[i];
          cantColores++;

        }

      }

      if (cantColores == cantidadInicial) {

        resto[cantResto] = palabras[i];
        cantResto++;

      }

    }

    s.close();

    // Array inicial
    
    System.out.print("Indice: ");
    for (int i = 0; i < 8; i++) System.out.printf("%-10d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (int i = 0; i < 8; i++) System.out.printf("%-10s", palabras[i]);

    System.out.println();

    //Calculos

    for (int i = 0; i < cantColores; i++) palabras[i] = colores[i];

    for (int i = cantColores; i < 8; i++) palabras[i] = resto[i - cantColores];

    // Array final

    System.out.print("Indice: ");
    for (int i = 0; i < 8; i++) System.out.printf("%-10d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (int i = 0; i < 8; i++) System.out.printf("%-10s", palabras[i]);

  }
}