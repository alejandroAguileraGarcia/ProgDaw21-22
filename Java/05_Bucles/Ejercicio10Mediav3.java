import java.util.Scanner;

public class Ejercicio10Mediav3 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    double media = 0;
    double n = 0;
    double suma = 0;

    int cantidadNumeros;

    System.out.print("¿Cuantos numeros quieres introducir? ");
    cantidadNumeros = s.nextInt();

    for (int i = 0; i < cantidadNumeros; i++){
      do {
        System.out.print("Introduce un numero: ");
        n = s.nextInt();
        
        if (n < 0){
          System.out.println("ERROR");
        }
      } while (n < 0);
      suma = suma + n;
    }

    media = suma/cantidadNumeros;
    System.out.println("La media es "+ media);

    s.close();
  }
}
