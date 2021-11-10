public class Ejercicio10Lineas {
  public static void main(String[] args) {
    
    char caracter;
    int numeroCaracter;
    int longitud;

    for (int i = 0; i < 10; i++) {

      numeroCaracter = (int) (Math.random() * 6);
      longitud = (int) (Math.random() * 40) + 1;

      switch (numeroCaracter) {
        case 0:
          caracter = '*';
          break;
        case 1:
          caracter = '-';
          break;
        case 2:
          caracter = '=';
          break;
        case 3:
          caracter = '.';
          break;
        case 4:
          caracter = '|';
          break;
        case 5:
          caracter = '@';
          break;
        default:
          caracter = ' ';
          break;
      }//Switch

      for (int j = 0; j < longitud; j++) System.out.print(caracter);

      System.out.println();

    }

  }
}
