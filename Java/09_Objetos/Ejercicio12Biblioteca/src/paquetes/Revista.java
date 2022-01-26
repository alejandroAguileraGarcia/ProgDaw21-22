package paquetes;

public class Revista extends Publicacion {
  private int numero;

  public Revista(String ISBN, String titulo, int anioPubli, int numero) {
    super(ISBN, titulo, anioPubli);
    this.numero = numero;
  }
}
