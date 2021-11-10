public class Ejercicio18Colores {
  public static void main(String[] args) {
    
    int numeroAleatorio;
    String color;
    String color1 = "color1";
    String color2 = "color2";
    String color3 = "color3";
    
    for (int i = 0; i < 3; i++) {

      do {

        numeroAleatorio = (int) (Math.random() * 6);

        switch (numeroAleatorio) {
          case 0:
            color = "rojo";
            break;
          case 1:
            color = "azul";
            break;
          case 2:
            color = "verder";
            break;
          case 3:
            color = "amarillo";
            break;
          case 4:
            color = "violeta";
            break;
          case 5:
            color = "naranja";
            break;
          default:
            color = " ";
            break;
        } //Switch

        switch (i) {
          case 0:
            color1 = color;
            break;
          case 1:
            color2 = color;
            break;
          case 2:
            color3 = color;
            break;

        } //Switch

      }while (color1.equals(color2) || color1.equals(color3) || color2.equals(color3));

    }

    System.out.println(color1);
    System.out.println(color2);
    System.out.println(color3);
  
  }
}
