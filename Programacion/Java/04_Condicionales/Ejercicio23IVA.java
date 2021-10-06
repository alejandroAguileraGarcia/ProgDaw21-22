import java.util.Scanner;

public class Ejercicio23IVA {
  public static void main (String[] args){
    Scanner s =new Scanner(System.in);

    double baseImponible;
    double precioConIva;
    double ivaNumerico=0;
    double ivaTotal;
    double precioTotal=0;
    double descuentoCodigo=0;

    String iva;
    String codigoPromocional;

    System.out.print("Introduzca la base imponible: ");
    baseImponible = s.nextDouble();

    s.nextLine();

    System.out.print("Introduzca el tipo de IVA (general, reducido, superreducido): ");
    iva = s.nextLine();

    switch (iva){
      case "general":
        ivaNumerico=0.21;
        break;
      case "reducido":
        ivaNumerico=0.10;
        break;
      case "superreducido":
        ivaNumerico=0.04;
        break;
      default:
        System.out.println("IVA no valido");
        break;
    }

    ivaTotal=baseImponible*ivaNumerico;

    precioConIva=baseImponible+ivaTotal;

    System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
    codigoPromocional = s.nextLine();

    switch (codigoPromocional){
      case "nopro":
        precioTotal=precioConIva;
        break;
      case "mitad":
        precioTotal=precioConIva*0.5;
        descuentoCodigo=precioTotal;
        break;
      case "meno5":
        precioTotal=precioConIva-5;
        descuentoCodigo=5;
        break;
      case "5porc":
        precioTotal=precioConIva*0.95;
        descuentoCodigo=precioConIva*0.05;
        break;
      default:
        System.out.println("Codigo no valido");
        break;
    }

    System.out.printf("Base imponible: %.2f\n", baseImponible);
    System.out.printf("IVA (%s): %.2f\n",iva, ivaTotal);
    System.out.printf("Precio con IVA: %.2f\n", precioConIva);
    System.out.printf("Cod. promo (%s): - %.2f\n",codigoPromocional, descuentoCodigo);
    System.out.printf("TOTAL: %.2f\n", precioTotal);


    s.close();
  }
}
