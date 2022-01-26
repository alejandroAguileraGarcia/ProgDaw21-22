package paquetes;

public class Publicacion {
  
  protected String ISBN;
  protected String titulo;
  protected int anioPubli;

  public Publicacion(String ISBN, String titulo, int anioPubli) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anioPubli = anioPubli;
  }

  public String toString() {
    return "ISBN: " + this.ISBN + ", titulo: " + this.titulo + ", año de publicacion: " + this.anioPubli;
  }

}
