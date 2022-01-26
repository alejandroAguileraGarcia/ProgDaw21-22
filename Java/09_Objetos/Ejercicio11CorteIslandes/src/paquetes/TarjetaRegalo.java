package paquetes;

public class TarjetaRegalo {
  
  private String numero;
  private double cantidad;

  public TarjetaRegalo(double dinero) {
    int nAleatorio = (int)(Math.random() * 100000);

    String numeroAleatorio = "" + nAleatorio;

    while (numeroAleatorio.length() < 5){
      numeroAleatorio = "0" + numeroAleatorio;
    }

    this.cantidad = dinero;
    this.numero = numeroAleatorio;
  }

  @Override
  public String toString() {
    return "Tarjeta nª " + this.numero + " - Saldo " + this.cantidad;
  }

  public void gasta(double gastado) {
    if (gastado <= this.cantidad) this.cantidad -= gastado;
    else System.out.println("No tiene tanto dinero disponible");
  }

  public TarjetaRegalo fusionaCon (TarjetaRegalo t1) {
    TarjetaRegalo fusion = new TarjetaRegalo (this.cantidad + t1.cantidad);

    this.cantidad = 0;
    t1.cantidad = 0;

    return fusion;
  }

}
