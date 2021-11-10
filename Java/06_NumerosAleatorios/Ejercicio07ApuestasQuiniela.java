public class Ejercicio07ApuestasQuiniela {
  public static void main(String[] args) {
    
    int numeroAleatorio;

    for (int i = 0; i < 15; i++) {

      for (int j = 0; j < 3; j++) {

        numeroAleatorio = (int) (Math.random() * 3);

        System.out.print(numeroAleatorio == 0 ? "x\t" : numeroAleatorio + "\t");

      }

      System.out.println();

    }

  }
}
