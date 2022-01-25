package paquetes;

public class Coche extends Vehiculo {
  
  private int cilindrada;
  
  public Coche (int cilindrada) {
    super();
    this.cilindrada = cilindrada;
  }

  public void quemarRueda() {
    System.out.println("Brrr");
  }

}
