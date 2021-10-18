import java.util.Scanner;

public class Ejercicio25NumeroReves {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numero;
    int reves = 0;
    
    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    while(numero > 0){
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
    }

    System.out.println(reves);
    
    s.close();
  }
}
