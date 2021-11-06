
public class Ejercicio01Tirada3Dados {
  public static void main(String[] args) {

    int suma = 0;
    int numeroAleatorio;
    
    for (int i = 1; i <= 3; i++){
      
      numeroAleatorio = (int) (Math.random() * 3 + 1);
      suma += numeroAleatorio;
      System.out.printf("El dado %d es: %d\n", i, numeroAleatorio);

    }

    System.out.printf("La suma es: %d", suma);

  }
}
