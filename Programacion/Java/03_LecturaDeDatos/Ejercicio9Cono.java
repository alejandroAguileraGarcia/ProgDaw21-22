import java.util.Scanner;

public class Ejercicio9Cono {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double volumen;
    double radio;
    double altura;

    System.out.println("Introduzca el radio del cono: ");
    radio=Double.parseDouble(s.nextLine());
//CAPTURA PERFECTA DE DATOS
    System.out.println("Introduzca la altura del cono: ");
    altura=Double.parseDouble(s.nextLine());
    
    volumen=Math.PI/3*Math.pow(radio,2)*altura;

    System.out.printf("El volumen del cono es: %.2f", volumen);
  
    s.close();
  }
}