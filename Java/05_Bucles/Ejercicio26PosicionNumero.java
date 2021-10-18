import java.util.Scanner;

public class Ejercicio26PosicionNumero {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int numero;
    int digito;
    int digitoaux;
    int posicion = 0;
    int reves = 0;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    System.out.print("Introduce un digito: ");
    digito = s.nextInt();

    s.close();

    while(numero > 0){
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
    }

    do{
      digitoaux = reves%10;
      posicion++;
      reves /= 10;

      if (digitoaux == digito){
        System.out.println(posicion);
      }
    }while(reves > 0);

  }
}
