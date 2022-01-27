package paquetes;

public class Linea {
  
  private Punto p1;
  private Punto p2;

  public Linea(Punto p1, Punto p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return "Línea formada por los puntos: " + this.p1.toString() + " y " + this.p2.toString();
  }

}
