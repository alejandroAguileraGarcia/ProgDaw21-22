import java.util.Scanner;

public class Pruebas {
  public static void main(String[] args) {   
    Scanner s = new Scanner(System.in);

    double euro=0;
    double dolar=0;
    double libra=0;
    double yen=0;
    double yuan=0;

    final double FACTOR_EURO_DOLAR=1.16;
    final double FACTOR_EURO_LIBRA=0.84;
    final double FACTOR_EURO_YEN=133.06;
    final double FACTOR_EURO_YUAN=7.43;

    String moneda;

    System.out.print("Introduce la moneda de la que partes (euro, dolar, libra, yen, yuan, por defecto euro): ");
    moneda = s.nextLine();

    System.out.print("Introduce la cantidad que quieres transformar: ");//Voy a reutilizar la variable euro y despues la transformare a euros.
    euro = s.nextDouble();

    s.close();

    switch (moneda) {
      case "dolar":
        euro /= FACTOR_EURO_DOLAR; // euro = euro/FACTOR_EURO_DOLAR
        break;
      case "libra":
        euro /= FACTOR_EURO_LIBRA;
        break;
      case "yen":
        euro /= FACTOR_EURO_YEN;
        break;
      case "yuan":
        euro /= FACTOR_EURO_YUAN;
        break;
      default:
    }

    dolar = euro * FACTOR_EURO_DOLAR;
    libra = euro * FACTOR_EURO_LIBRA;
    yen = euro * FACTOR_EURO_YEN;
    yuan = euro * FACTOR_EURO_YUAN;

    System.out.printf("La cantidad en euros equivale a %.2f euros\n", euro);
    System.out.printf("La cantidad en euros equivale a %.2f dolares\n", dolar);
    System.out.printf("La cantidad en euros equivale a %.2f libras\n", libra);
    System.out.printf("La cantidad en euros equivale a %.2f yenes\n", yen);
    System.out.printf("La cantidad en euros equivale a %.2f yuanes\n", yuan);

  }
}