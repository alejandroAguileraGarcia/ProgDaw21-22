import java.util.Scanner;

public class Ejercicio2PareseImparesV2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    long numeroIntroducido;

    long numeroImpares = 0;
    long numeroPares = 0;

    int longitud = 0;

    long digito;

    System.out.print("Introduce un numero largo positivo: ");
    numeroIntroducido = s.nextLong();

    s.close();

    for (long i = numeroIntroducido; i > 0; i /= 10) longitud++;

    for (int i = longitud - 1; i >= 0; i--){

      digito = numeroIntroducido / (long) Math.pow(10, i);
      
      if (digito % 2 == 0){
        numeroPares = numeroPares * 10 + digito;
      }else{
        numeroImpares = numeroImpares * 10 + digito;
      }

      numeroIntroducido %= (long) Math.pow(10, i);

    }

    System.out.println(numeroPares);
    System.out.println(numeroImpares);

  }
}

