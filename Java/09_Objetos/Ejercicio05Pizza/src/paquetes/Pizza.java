package paquetes;

public class Pizza {
  
  private static int totalPizzaPedidas = 0;
  private static int totalPizzaServidas = 0;
  
  private String tamaño;
  private String tipo;
  private String estado;

  public Pizza (String tipo, String tamaño) {
    this.tipo = tipo;
    this.tamaño = tamaño;
    this.estado = "pedida";
    totalPizzaPedidas++;
  }

  public String toString() {
    return "pizza " + this.tipo + " " + this.tamaño + " " + this.estado;
  }

  public static int getTotalPedidas(){
    return totalPizzaPedidas;
  }

  public static int getTotalServidas(){
    return totalPizzaServidas;
  }

  public void sirve() {
    if (this.estado.equals("pedida")){
      this.estado = "servida";
      totalPizzaServidas++;
    } else System.out.println("esa pizza ya se ha servido");
  }

}