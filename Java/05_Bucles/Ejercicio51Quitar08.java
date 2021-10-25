import java.util.Scanner;

public class Ejercicio51Quitar08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long numero;
    long reves = 0;
    long numeroFinal = 0;

    boolean comido = false;

    System.out.print("Introduce un numero mayor que cero: ");
    numero = s.nextLong();

    s.close();

    //Damos la vuelta al numero

    while(numero > 0){
      reves = (reves * 10) + (numero % 10);
      numero = numero / 10;
    }

    while (reves > 0){

      if ((reves % 10 != 0) && (reves % 10 != 8)) {
        numeroFinal = (numeroFinal * 10) + (reves % 10);
      }else{
        comido = true;
      }
      
      reves /= 10;

    }

    if (comido == true){
      System.out.println("Despues de haber sido comido el numero se queda en: " + numeroFinal);
    }else{
      System.out.println("El gusano no se ha comido ningun numero");
    }
    

  }
}
