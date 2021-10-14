import java.util.Scanner;

public class Ejercicio18NumerosEnterosEntreDos {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    int mayor = 0;
    int menor = 0;
    int aux = 0;

    System.out.print("Introduce un numero entero:");
    mayor = s.nextInt();

    System.out.print("Introduce otro numero entero:");
    menor = s.nextInt();

    if (mayor != menor) {
      if (menor > mayor) {
        aux = menor ;
        menor = mayor;
        mayor = aux;
      }

      while (menor <= mayor) {
        System.out.println(menor);
        menor = menor + 7;
      }

    }else{
      System.out.println("Numeros invalidos");
    }

    s.close();
  }
}
