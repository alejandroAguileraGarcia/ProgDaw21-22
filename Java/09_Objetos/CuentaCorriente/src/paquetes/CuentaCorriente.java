package paquetes;

public class CuentaCorriente {
  
  private String numeroCuenta;
  private int saldo;
  
  public CuentaCorriente(int saldo) {
    this.numeroCuenta = generateNC();
    this.saldo = saldo;
  }

  public CuentaCorriente() {
    this.numeroCuenta = generateNC();
    this.saldo = 0;
  }

  public String toString() {
    return "Número de cta: " + this.numeroCuenta + " Saldo: " + saldo;
  }

  private String generateNC() {
    String NC = "";

    for (int i = 0; i < 10; i++){
      NC += (int)(Math.random() * 10);
    }
    return NC;
  }

  public void ingreso (int cantidad) {
    this.saldo += cantidad;
  }

  public void cargo (int cantidad) {
    this.saldo -= cantidad;
  }

  public void transferencia (CuentaCorriente recibe, int cantidad) {
    this.saldo -= cantidad;
    recibe.saldo += cantidad;
  }

}
