import java.util.Scanner;

public class Ejercicio42Primos {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int numero;
    int contadorDivisores = 0;

    System.out.print("Introduce un numero entero positivo: ");
    numero = s.nextInt();
    
    for(int i = numero; i < (numero+5); i++){
      contadorDivisores = 0;
      
      for (int j = 1; j <= i; j++){
        if (i%j == 0){
          contadorDivisores++;
        }
      }
  
      if (contadorDivisores == 2){
        System.out.printf("%d es primo\n", i);
      }else{
        System.out.printf("%d no es primo\n", i);
      }
    }
    s.close();
  }
}
