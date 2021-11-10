public class Ejercicio19 {
  public static void main(String[] args) {
    
    int numeroAleatorio;
    double suma = 0;

    for (int i = 0; i < 50; i++) {
      
      numeroAleatorio = (int) (Math.random() * 301 - 100);

      System.out.print(numeroAleatorio + "\t");

      suma += numeroAleatorio;
    }

    System.out.println();
    
    System.out.println("La media es: " + (double) suma / 50);
  }
}
