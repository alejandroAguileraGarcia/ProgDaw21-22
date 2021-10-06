public class Ejercicio7IVA {
  public static void main(String[] args) {
    
    double precioBase;
    double precioFinal;

    System.out.println("Introduzca la cantidad sin IVA: ");
    precioBase=Double.parseDouble(System.console().readLine());


    precioFinal=precioBase*1.21;
    
    System.out.printf("El precio introducido con iva corresponde a: %.2f", precioFinal);
  }
}