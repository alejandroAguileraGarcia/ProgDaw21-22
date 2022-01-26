package paquetes;

public class CuentaCorriente {
  
  private long numeroCuenta;
  private int saldo;
  
  public CuentaCorriente() {
    this.numeroCuenta = (long)(Math.random() * 10000);
  }
}
