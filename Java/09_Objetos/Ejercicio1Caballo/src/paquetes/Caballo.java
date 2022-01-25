package paquetes;

public class Caballo {
  
  private String nombre;
  private int edad;
  private String nPadre;
  private String nMadre;

  public Caballo (String nombre, String nMadre, String nPadre, int edad) {
    this.nombre = nombre;
    this.nMadre = nMadre;
    this.nPadre = nPadre;
    this.edad = edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void incrementarEdad (){
    this.edad = this.edad + 1;
  }

  public String toString() {
    return this.nombre + " " + this.nMadre + " " + this.nPadre + " " + this.edad;
  }

  public Caballo tenerHijos (Caballo pareja, String nombre) {
    return new Caballo (nombre, this.nombre, pareja.getNombre(), 0);
  }
  
}
