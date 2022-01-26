package paquetes;

public class Ameba {
  private int peso;

  public Ameba() {
    this.peso = 3;
  }

  public void come(int comida) {
    this.peso += (comida - 1);
  }

  public void come(Ameba comida) {
    this.peso += (comida.peso - 1);
    comida.peso = 0;
  }

  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos";
  }

}
