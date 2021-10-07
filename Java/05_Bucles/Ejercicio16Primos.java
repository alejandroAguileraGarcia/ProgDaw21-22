import java.util.Scanner;

public class Ejercicio16Primos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numero = 0;
    int contadorDivisores = 1;

    System.out.println("Introduce un numero: ");
    numero = s.nextInt();

    for (int i = 1; i < numero; i++){
      if (numero%i == 0){
        contadorDivisores++;
      }
    }

    System.out.println(contadorDivisores);

    s.close();
  }
}
