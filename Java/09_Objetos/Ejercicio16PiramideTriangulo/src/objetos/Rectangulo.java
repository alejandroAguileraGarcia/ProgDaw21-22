package objetos;

public class Rectangulo {
  
  private int base;
  private int altura;

  private static int nRect = 0;

  public Rectangulo(int base, int altura) {
    this.altura = altura;
    this.base = base;
    nRect++;
  }

  @Override
  public String toString() {

    String salida = "";

    for (int i = 0; i < this.altura; i++) {
      for (int j = 0; j < this.base; j++) salida = salida + "*";
      salida = salida + "\n";
    }

    return salida;
  }

  public static int getRectangulosCreados() {
    return nRect;
  }
}
