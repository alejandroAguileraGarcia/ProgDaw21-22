import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
  
    double suma = 0;
    double numeroIntroducido = 0;
    int contadorNumerosIntroducidos = 0;

    while (suma <=10000){
      System.out.print("Introduce un numero: ");
      numeroIntroducido = s.nextDouble();

      suma += numeroIntroducido;
      contadorNumerosIntroducidos++;
    }
    
    System.out.println("Total acumulado: "+ (suma-numeroIntroducido));
    System.out.println("Numeros introducidos: "+ (contadorNumerosIntroducidos-1));
    System.out.println("La media es: "+ ((suma-numeroIntroducido)/(contadorNumerosIntroducidos-1)));

    s.close();
  }
}
