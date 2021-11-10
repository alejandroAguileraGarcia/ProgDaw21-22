public class Ejercicio09NumerosPares {
  public static void main(String[] args) {
    
    int numeroAleatorio;
    int contador = 0;

    do {

      numeroAleatorio = (int) (Math.random() * 51) * 2;

      contador ++;

      System.out.println(numeroAleatorio);

    } while (numeroAleatorio != 24);

    System.out.println("Se han generado " + contador);
  }
}
