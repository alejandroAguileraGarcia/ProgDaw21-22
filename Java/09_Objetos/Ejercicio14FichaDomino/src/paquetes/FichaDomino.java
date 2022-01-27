package paquetes;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class FichaDomino {
  
  private int numDerecha;
  private int numIzquierda;

  public FichaDomino(int derecha, int izquierda) {
    this.numDerecha = derecha;
    this.numIzquierda = izquierda;
  }

  public FichaDomino() {
    this.numDerecha = (int)(Math.random() * 7);
    this.numIzquierda = (int)(Math.random() * 7);
  }

  public String toString() {
    return "[" + (this.numIzquierda == 0 ? " ": this.numIzquierda) + "|" + (this.numDerecha == 0 ? " ": this.numDerecha) + "]";
  }

  public FichaDomino voltea() {
    int aux = this.numDerecha;
    this.numDerecha = this.numIzquierda;
    this.numIzquierda = aux;
    return this;
  }

  public boolean encaja(FichaDomino f2) {
    if (this.numDerecha == f2.numDerecha || this.numDerecha == f2.numIzquierda || this.numIzquierda == f2.numDerecha || this.numIzquierda == f2.numIzquierda) return true;
    return false;
  }

  public boolean encajaBien(FichaDomino f2) {
    if (this.numDerecha == f2.numIzquierda) return true;
    return false;
  }

}

