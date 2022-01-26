package paquetes;

public class Coche extends Vehiculo {
  
  private int cilindradaMotor;
  
  public Coche (int cilindradaMotor) {
    super();
    this.cilindradaMotor = cilindradaMotor;
  }

  public void quemarRueda() {
    System.out.println("Brrr");
  }

}
