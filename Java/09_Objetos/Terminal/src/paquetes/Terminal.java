package paquetes;

public class Terminal {
  
  private String numero;
  private int tiempoConversacion;

  public Terminal(String numero) {
    this.numero = numero;
    this.tiempoConversacion = 0;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversacion;
  }

  public int getTiempoConver() {
    return tiempoConversacion;
  }

  public String getNumero() {
    return numero;
  }

  public void llama(Terminal t, int tiempo) {
    this.tiempoConversacion += tiempo;
    t.tiempoConversacion += tiempo;
  }

}
