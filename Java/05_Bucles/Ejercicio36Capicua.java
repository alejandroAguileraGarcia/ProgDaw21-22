import java.util.Scanner;

public class Ejercicio36Capicua {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero;
    int numeroIntroducido;
    int reves = 0;

    System.out.print("Introduce un numero: ");
    numeroIntroducido = s.nextInt();

    s.close();
    
    numero = numeroIntroducido;

    while(numero>0){
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
    }

    if (numeroIntroducido == reves){
      System.out.println("El numero es capicua");
    }else{
      System.out.println("El numero no es capicua");
    }
  }
}
