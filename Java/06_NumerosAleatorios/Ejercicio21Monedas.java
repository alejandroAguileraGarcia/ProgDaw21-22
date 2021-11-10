public class Ejercicio21Monedas {
  public static void main(String[] args) {
    
    int caraCruz;
    int aleatorio;
    String moneda;

    for (int i = 0; i < 5; i++){
      
      caraCruz = (int) (Math.random() * 2);
      aleatorio = (int) (Math.random() * 8);

      switch (aleatorio) {
        case 0:
          moneda = "1 centimo";
          break;
        case 1:
          moneda = "2 centimos";
          break;
        case 2:
          moneda = "5 centimos";
          break;
        case 3:
          moneda = "10 centimos";
          break;
        case 4:
          moneda = "20 centimos";
          break;
        case 5:
          moneda = "50 centimos";
          break;
        case 6:
          moneda = "1 euro";
          break;
        case 7:
          moneda = "2 euros";
          break;
        default:
          moneda = " ";
          break;
      } //Switch

      System.out.println(moneda + " - " + (caraCruz == 0 ? "cara" : "cruz"));
      
    } //For

  }
}
