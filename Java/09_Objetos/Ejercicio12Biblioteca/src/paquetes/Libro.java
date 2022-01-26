package paquetes;

public class Libro extends Publicacion implements Prestable {
  
  private boolean prestado;

  public Libro(String ISBN, String titulo, int anioPubli) {
    super(ISBN, titulo, anioPubli);
    this.prestado = false;
  }

  @Override
  public String toString() {
    return super.toString() + "  " +  this.prestado;
  }

  @Override
  public void presta(){
    if (!this.estaPrestado()) this.prestado = true;
    else System.out.println("Lo siento el libro esta prestado");
  }

  @Override
  public void devuelve(){
    if (this.estaPrestado()) this.prestado = false;
    else System.out.println("Lo siento el libro no esta prestado");
  }

  @Override
  public boolean estaPrestado(){
    return this.prestado;
  }

}
 