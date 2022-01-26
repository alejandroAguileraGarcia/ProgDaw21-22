import paquetes.Vehiculo;
import paquetes.Coche;
import paquetes.Bicicleta;

public class PruebaCoche {
  public static void main(String[] args) {
    
    int opcion = 0;
    int km;

    Bicicleta hondaBicicleta = new Bicicleta(9);
    Coche audiA4 = new Coche(1900);

    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");

      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros ha recorrido? ");
          km = Integer.parseInt(System.console().readLine());
          hondaBicicleta.recorre(km);
          break;
        case 2:
          hondaBicicleta.caballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros ha recorrido? ");
          km = Integer.parseInt(System.console().readLine());
          audiA4.recorre(km);
          break;
        case 4:
          audiA4.quemarRueda();
          break;
        case 5:
          System.out.println("La bicicleta ha recorrido: ");
          System.out.println(hondaBicicleta.getKilometrajeIndividual() + " Km");
          break;
        case 6:
          System.out.println("El coche ha recorrido: ");
          System.out.println(audiA4.getKilometrajeIndividual() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      }
    }
  }
}
