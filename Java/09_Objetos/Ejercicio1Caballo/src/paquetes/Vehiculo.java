package paquetes;

public abstract class Vehiculo {
  
  private static int vehiculosTotales = 0;
  private static int kilometrosTotales = 0;

  private int kilometrajeIndividual;

  public Vehiculo () {
    this.kilometrosTotales = 0;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static int getVehiculosTotales() {
    return vehiculosTotales;
  }

  public int getKilometrajeIndividual () {
    return kilometrajeIndividual;
  }

  public void recorre (int kilometros) {
    this.kilometrajeIndividual += kilometros;
    Vehiculo.kilometrosTotales += kilometros;
  }
  
}
