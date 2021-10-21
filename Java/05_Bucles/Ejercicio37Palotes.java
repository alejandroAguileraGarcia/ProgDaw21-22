import java.util.Scanner;

public class Ejercicio37Palotes {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numero;
    int aux;
    int reves = 0;
    int digito;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    s.close();

    aux = numero;

    /* Damos vuelta al numero */
    while(aux>0){
      reves = (reves * 10) + (aux % 10);
      aux /= 10;
    }

    System.out.print("El numero en el sistema palotes es: ");
    
    while (reves > 0){
      digito = reves % 10;

      for (int i = 0; i < digito; i++){
        System.out.print("|");
      }

      if (reves > 10){
        System.out.print(" - ");
      }

      reves /= 10;
    }
  }
}
