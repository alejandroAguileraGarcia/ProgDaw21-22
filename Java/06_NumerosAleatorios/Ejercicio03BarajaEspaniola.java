public class Ejercicio03BarajaEspaniola {
  public static void main(String[] args) {
    
    int numero = (int) (Math.random() * 10 + 1);

    String numeroCarta;
    String paloCarta;

    switch (numero) {
      case 1:
        numeroCarta = "as";
        break;
      case 8:
        numeroCarta = "sota";
        break;
      case 9:
        numeroCarta = "caballo";
        break;
      case 10:
        numeroCarta = "rey";
        break;
      default:
        numeroCarta = String.valueOf(numero);
        break;
    }//switch numero

    numero = (int) (Math.random() * 4);

    switch (numero) {
      case 0:
        paloCarta = "bastos";
        break;
      case 1:
        paloCarta = "oros";
        break;
      case 2:
        paloCarta = "espadas";
        break;
      default:
        paloCarta = "copas";
        break;
    }//switch palo

    System.out.printf("La carta es %s de %s", numeroCarta, paloCarta);

  }
}
