public class Ejercicio02BarajaFrancesa {
  public static void main(String[] args) {
    
    int numero = (int) (Math.random() * 13 + 1);

    String numeroCarta;
    String paloCarta;

    switch (numero) {
      case 1:
        numeroCarta = "A";
        break;
      case 11:
        numeroCarta = "J";
        break;
      case 12:
        numeroCarta = "Q";
        break;
      case 13:
        numeroCarta = "K";
        break;
      default:
        numeroCarta = String.valueOf(numero);
        break;
    }//switch numero

    numero = (int) (Math.random() * 4);

    switch (numero) {
      case 0:
        paloCarta = "picas";
        break;
      case 1:
        paloCarta = "corazones";
        break;
      case 2:
        paloCarta = "diamantes";
        break;
      default:
        paloCarta = "trevoles";
        break;
    }//switch palo

    System.out.printf("La carta es %s de %s", numeroCarta, paloCarta);

  }
}
