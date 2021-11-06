import java.util.Scanner;

public class Ejercicio3IVA {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double precioConIva;
    double precioSinIva;
    double total = 0;
    int cantidad;

    int IVA;

    double base4 = 0;
    double base10 = 0;
    double base21 = 0;

    double iva4 = 0;
    double iva10 = 0;
    double iva21 = 0;

    String nombreArticulo;

    System.out.println("Factura tienda");
    System.out.println("==============");

    do{

      System.out.print("Introduce el nombre del artículo ('fin' para salir): ");
      nombreArticulo = s.nextLine();

      if (!nombreArticulo.equals("fin")){

        System.out.printf("Precio por unidad para %s (IVA incluido): ", nombreArticulo);
        precioConIva = s.nextDouble();

        System.out.printf("Cantidad de unidades de %s: ", nombreArticulo);
        cantidad = s.nextInt();

        System.out.printf("Introduce el tipo de IVA para %s (4,10,21): ", nombreArticulo);
        IVA = s.nextInt();

        s.nextLine();

        switch (IVA){
          case 4:
            precioSinIva = precioConIva / 1.04;
            base4 += precioSinIva * cantidad;
            iva4 += (precioConIva - precioSinIva) * cantidad;
            break;
          case 10:
            precioSinIva = precioConIva / 1.1;
            base10 += precioSinIva * cantidad;
            iva10 += (precioConIva - precioSinIva) * cantidad;
            break;
          case 21:
            precioSinIva = precioConIva / 1.21;
            base21 += precioSinIva * cantidad;
            iva21 += (precioConIva - precioSinIva) * cantidad;
            break;
          default:
            break;
        }//Switch

        total = total + precioConIva * cantidad;

      }//IF

    } while (!nombreArticulo.equals("fin"));

    System.out.printf("TOTAL:%36.2f", total);
    System.out.println();

    for (int i = 1; i <= 42; i++)System.out.print("-");
    System.out.println();

    System.out.printf("Base imponible  4%%:%11.2f IVA:%7.2f\n", base4, iva4);

    System.out.printf("Base imponible 10%%:%11.2f IVA:%7.2f\n", base10, iva10);

    System.out.printf("Base imponible 21%%:%11.2f IVA:%7.2f\n", base21, iva21);

    s.close();
  }
}
