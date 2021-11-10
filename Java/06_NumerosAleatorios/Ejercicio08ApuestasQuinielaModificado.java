public class Ejercicio08ApuestasQuinielaModificado {
  public static void main(String[] args) {
    
    int numeroAleatorio;
    char resultado;

    for (int i = 0; i < 15; i++) {

      for (int j = 0; j < 3; j++) {

        numeroAleatorio = (int) (Math.random() * 6);

        if (numeroAleatorio < 3) resultado = '1';
        else if (numeroAleatorio == 3) resultado = 'x';
        else resultado = '2';

        System.out.print(resultado + "\t");

      }

      System.out.println();

    }

  }
}
