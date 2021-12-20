public class ExtraMenu {
  public static void main(String[] args) {
    
    String[] menu = {"arroz", "patatas", "pollo", "verduras"};
    String[] semana = new String[7];
    int menuAleatorio;

    for (int i = 0; i < 7; i++) semana[i] = " ";

    for (int i = 1; i < 7; i++) {

      do {
        menuAleatorio = (int) (Math.random() * 4);
      
        semana[i] = menu [menuAleatorio];

      }while (semana[i].equals(semana[i - 1]));

    }

    do {
      menuAleatorio = (int) (Math.random() * 4);
    
      semana[0] = menu [menuAleatorio];

    }while (semana[0].equals(semana[6]) || semana[0].equals(semana[1]));

    for (int i = 0; i < 7; i++) System.out.println(semana[i]);
  }
}
