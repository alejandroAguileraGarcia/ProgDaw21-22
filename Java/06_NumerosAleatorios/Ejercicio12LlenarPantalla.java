public class Ejercicio12LlenarPantalla {
  public static void main(String[] args) {
    
    char caracter;

    for (int i = 0; i < 8000; i++) {

      caracter = (char) (Math.random() * (126 - 32 + 1) + 32);
      System.out.print(caracter);

    }
  }
}
