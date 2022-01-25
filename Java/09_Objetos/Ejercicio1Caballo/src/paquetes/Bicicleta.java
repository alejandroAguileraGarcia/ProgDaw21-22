package paquetes;

public class Bicicleta extends Vehiculo {
  
  private int pinones;
  
  public Bicicleta (int pinones) {
    super();
    this.pinones = pinones;
  }

  public void caballito() {
    System.out.println("Caballito");
  }

}
