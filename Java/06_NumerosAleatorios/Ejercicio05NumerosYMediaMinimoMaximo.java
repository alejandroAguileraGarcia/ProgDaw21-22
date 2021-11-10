public class Ejercicio05NumerosYMediaMinimoMaximo {
  public static void main(String[] args) {

    int numero;
    int minimo = 199;
    int maximo = 100;
    int suma = 0;
    double media;

    for (int i = 0; i < 50; i++) {
    numero = (int) (Math.random() * 100 + 100);

      System.out.print(numero + "  ");

      if (numero < minimo) minimo = numero;
      if (numero > maximo) maximo = numero;

      suma += numero;

    }//For

    media = (double) suma / 50;

    System.out.println();

    System.out.println("La media es: " + media);
    System.out.println("El numero mayor es: " + maximo);
    System.out.println("El numero menor es: " + minimo);

  }
}
