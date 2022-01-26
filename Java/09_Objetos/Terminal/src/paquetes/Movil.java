package paquetes;

import java.text.DecimalFormat;

public class Movil extends Terminal {
  
  private String tarifa;
  private double tarificados;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.tarificados = 0;
  }

  @Override
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Nº " + this.getNumero() + " - " + this.getTiempoConver() + " segundos - tarificados " + formatoEuros.format(this.tarificados);
  }

  @Override
  public void llama(Terminal t, int tiempo) {
    super.llama(t, tiempo);
    
    if (this.tarifa.equals("rata")) this.tarificados = this.tarificados + (tiempo * 0.06);
    else if (this.tarifa.equals("mono")) this.tarificados = this.tarificados + (tiempo * 0.12);
    else this.tarificados = this.tarificados + (tiempo * 0.30);
  }
  
}
