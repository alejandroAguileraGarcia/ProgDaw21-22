import java.util.Scanner;

public class Ejercicio13NumerosNegativosPositivos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int cantidadNegativos=0;
    int cantidadPositivos=0;
    int numero=0;

    for (int i=0; i<5; i++){
      System.out.print("Introduce un numero: ");
      numero=s.nextInt();

      if (numero>0){
        cantidadPositivos++;
      }else if (numero<0){
        cantidadNegativos++;
      }
    }

    System.out.printf("Hay %d numeros positivos y %d numeros negativos", cantidadPositivos, cantidadNegativos);

    s.close();
  }
}
