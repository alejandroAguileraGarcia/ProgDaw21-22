import java.util.Scanner;

public class Ejercicio21SecuenciaNumeros {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    double numeroIntroducido = 0;
    int numerosIntroducidos = 0;
    double sumaImpares = 0;
    double numeroImpares = 0;
    double mediaImpares = 0;
    double parMayor = 0;


    do{
      System.out.print("Introduce un numero:");
      numeroIntroducido = s.nextInt();

      if ((numeroIntroducido >= 0)&&(numeroIntroducido%2 != 0)){
        sumaImpares = sumaImpares + numeroIntroducido;
        numeroImpares++;
      }

      if ((numeroIntroducido > parMayor)&&(numeroIntroducido%2 == 0)){
        parMayor = numeroIntroducido;
      }

      numerosIntroducidos++;
    }while(numeroIntroducido >= 0);

    mediaImpares = sumaImpares/numeroImpares;

    System.out.printf("La media de los impares es: %.2f \n", mediaImpares);

    System.out.printf("Se han introducido %d numeros \n", (numerosIntroducidos-1));

    System.out.printf("El mayor de los pares introducidos es: %.2f", parMayor);

    s.close();
  }
}
