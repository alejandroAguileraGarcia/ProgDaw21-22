package objetos;

public class Piramide {
  private int altura;

  private static int nPiram = 0;

  public Piramide(int altura) {
    this.altura = altura;
    nPiram++;
  }

  @Override
  public String toString() {

    String salida = "";

    int relleno = 1;
    int espacios = this.altura - 1;
    for (int i = 0; i < this.altura; i++){
      for(int j = 1; j <= espacios; j++) salida = salida + " ";

      for(int k = 1; k <= relleno; k++) salida = salida + "*";
      
      salida = salida + "\n";
      espacios--;
      relleno += 2;
    }

    return salida;
  }

  public static int getPiramidesCreadas() {
    return nPiram;
  }
 
}
