package paquete;

public class Tiempo {
  
  private int horas;
  private int minutos;
  private int segundos;

  public Tiempo(int hora, int minutos, int segundos) {
    this.horas = hora;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public String toString() {
    return horas + " h " + minutos + " m " + segundos + " s";
  }

  public void suma(Tiempo t) {
    int aux = this.segundos + t.segundos;
    int aux2 = this.minutos +  t.minutos;

    this.segundos = aux % 60;
    this.minutos = aux2 % 60 + aux / 60;
    this.horas = this.horas + t.horas + aux2 / 60;
  }

  public void resta(Tiempo t) {
    int aux = this.segundos - t.segundos;
    int aux2 = this.minutos - t.minutos;

    this.segundos = aux;
    this.minutos = aux2;
    this.horas = this.horas - t.horas;

    if (aux < 0){
      this.minutos--;
      this.segundos += 60;
    }

    if (aux2 < 0){
      this.horas--;
      this.minutos += 60;
    }
  }

}
