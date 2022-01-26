package paquetes;

public class Fraccion {
  
  private int numerador;
  private int denominador;

  public Fraccion (int n, int d) {
    this.numerador = n;
    this.denominador = d;
  }

  public Fraccion () {
    this.numerador = 1;
    this.denominador = 3;
  }

  public Fraccion (int n) {
    this.numerador = n;
    this.denominador = 3;
  }

  public int obtenerNumerador() {
    return this.numerador;
  }

  public int obtenerDenominador() {
    return this.denominador;
  }

  public void cambiarNumerador(int n) {
    this.numerador = n;
  }

  public void cambiarDenominador(int d) {
    this.denominador = d;
  }

  public String toString () {
    return "Numerador: " + this.numerador + "\nDenominador: " + this.denominador;
  }
  
  public void invierte() {
    int aux = this.numerador;

    this.numerador = this.denominador;
    this.denominador = aux;
  }
                                              
  private int mcd() {
    int u = Math.abs(this.numerador);
    int v = Math.abs(this.denominador); 
    if (v == 0) {
        return u;
    }
    int r;
    while (v != 0) {
        r = u % v;
        u = v;
        v = r;
    }
    return u;
  }

  public void simplificar() {
    int n = mcd();
    this.numerador = this.numerador / n;
    this.denominador = this.denominador / n;
  }

  public void multiplica (int n) {
    this.numerador = this.numerador * n;
  }

  public void divide (int n) {
    this.denominador = this.denominador * n;
  }

  public void multiplica (Fraccion f) {
    this.numerador = this.numerador * f.numerador;
    this.denominador = this.denominador * f.denominador;
  }

  public void divide (Fraccion f) {
    this.numerador = this.numerador * f.denominador;
    this.denominador = this.denominador * f.numerador;
  }

}
