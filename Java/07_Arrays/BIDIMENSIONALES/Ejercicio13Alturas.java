public class Ejercicio13Alturas {
  public static void main(String[] args) {
    
    String paises[] = {"España", "Rusia", "Japón", "Australia"};

    int alturas[][] = new int[4][10];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) alturas[i][j] = (int) (Math.random() * 71) + 140;
    }

    for (int i = 0; i < 4; i++) {
      int suma = 0;
      System.out.printf("%9s:", paises[i]);

      for (int j = 0; j < 10; j++) {
        System.out.printf("%4d", alturas[i][j]);
        suma += alturas[i][j];
      }

      System.out.printf(" |%4d\n", suma / 10);
    }
  }
}