import java.util.Scanner;

public class Ejercicio16Primos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int contadorDivisores = 1;

    System.out.print("Introduce un numero: ");
    numero = s.nextInt();

    for (int i = 1; i < numero; i++){
      if (numero%i == 0){
        contadorDivisores++;
      }
    }

    if (contadorDivisores == 2){
      System.out.println("El numero es primo");
    }else{
      System.out.println("El numero no es primo");
    }

    s.close();
  }
}
