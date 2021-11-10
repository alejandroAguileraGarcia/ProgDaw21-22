public class Ejercicio16Tragaperras {
  public static void main(String[] args) {
    
    int aleatorio;

    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    String figura;

    for (int i = 0; i < 3; i++) {
      aleatorio = (int) (Math.random() * 5);

      switch (aleatorio) {
        case 0:
          figura = "corazon ";
          break;
        case 1:
          figura = "diamante ";
          break;
        case 2:
          figura = "herradura ";
          break;
        case 3:
          figura = "campana ";
          break;
        case 4:
          figura = "limon ";
          break;
        default:
          figura = " ";
          break;
      } //Switch

      if (i == 0) figura1 = aleatorio;
      else if (i == 1) figura2 = aleatorio;
      else if (i == 2) figura3 = aleatorio;

      System.out.print(figura);
    }
    
    System.out.println();

    if (figura1 == figura2 && figura2 == figura3) System.out.println("Enhorabuena has ganado 10 monedas");
    else if (figura1 != figura2 && figura2 != figura3 && figura1 != figura3) System.out.println("Has perdido");
    else System.out.println("Has ganado una moneda");
  }
}
