import paquetes.Zona;
import java.util.Scanner;

public class pruebaZona {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    int opcion2 = 0;
    int nEntradas;

    Zona principal = new Zona (1000);
    Zona compraVenta = new Zona (200);
    Zona vip = new Zona (25);

    while (opcion != 3) {
      System.out.println("1. Mostrar el número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");

      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("Principal: " + principal.getEntradasPorVender());
          System.out.println("Compra-Venta: " + compraVenta.getEntradasPorVender());
          System.out.println("VIP" + vip.getEntradasPorVender());
          break;
        case 2:
          System.out.println("¿Para que zona quieres comprar entradas?");
          System.out.println("1. Principal");
          System.out.println("2. Compra - Venta");
          System.out.println("3. VIP: ");
          opcion2 = s.nextInt();
          System.out.println("¿Cuantas entradas quieres comprar?");
          nEntradas = s.nextInt();

          switch (opcion2) {
            case 1:
              principal.vender(nEntradas);
              break;
            case 2:
              compraVenta.vender(nEntradas);
              break;
            case 3:
              vip.vender(nEntradas);
              break;
            default:
          }
        default:
      }

    }

    s.close();

  }
}
