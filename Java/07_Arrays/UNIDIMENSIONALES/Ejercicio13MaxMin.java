import java.util.Scanner;

public class Ejercicio13MaxMin {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int maximo = 0;
    int minimo = 500;
    int numeros[] = new int[100];
    int opcion;

    for (int i = 0; i < 100; i++){
      
      numeros[i] = (int) (Math.random() * 501);

      if  (numeros[i] > maximo) maximo = numeros[i];
      else if (numeros[i] < minimo) minimo = numeros[i];

    }

    for (int i = 0; i < 100; i++) System.out.print(numeros[i] + " ");
    
    System.out.println();
    
    System.out.println("¿Qué quiere destacar? 1 - minimo 2 - maximo");
    opcion = s.nextInt();

    s.close();

    opcion = opcion == 1 ? minimo : maximo;

    for (int i = 0; i < 100; i++) {

      System.out.print(opcion == numeros[i] ? " **" + numeros[i] + "** " : numeros[i] + " ");
    }
    
  }
}
