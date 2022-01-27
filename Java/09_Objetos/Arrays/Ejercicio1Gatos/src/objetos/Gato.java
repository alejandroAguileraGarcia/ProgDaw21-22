package objetos;

public class Gato {
  
  private String nombre;
  private String color;
  private String sexo;

  public Gato() {
  }

  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return nombre + " " + color + " " + sexo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getColor() {
    return this.color;
  }

  public String getSexo() {
    return this.sexo;
  }
}
