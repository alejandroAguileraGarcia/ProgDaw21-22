package objetos;

public class Incidencia {
  
  private int nIncidencia;
  private int nPuesto;
  private String problema;
  private String solucion;
  private boolean resuelta;

  private static int nTotalIncidencias = 0;
  private static int nTotalIncidenciasResueltas = 0;

  public Incidencia(int nPuesto, String problema) {
    nTotalIncidencias++;
    this.nIncidencia = nTotalIncidencias;
    this.nPuesto = nPuesto;
    this.problema = problema;
    this.resuelta = false;
    this.solucion = "";
  }

  @Override
  public String toString() {
    return "Incidencia: " + this.nIncidencia + " Puesto: " + this.nPuesto + " - " + this.problema + " - " + (resuelta ? "Resuelta - " + this.solucion : "Pendiente");
  }

  public void resuelve(String solucion) {
    this.solucion = solucion;
    this.resuelta = true;
    nTotalIncidenciasResueltas++;
  }

  public static int getPendientes() {
    return nTotalIncidencias - nTotalIncidenciasResueltas;
  }
}
