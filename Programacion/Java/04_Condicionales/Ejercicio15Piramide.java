import java.util.Scanner;

public class Ejercicio15Piramide {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    char e;
    int direccion;

    System.out.println("Introduce el caracter con el que quieres dibujar la piramide: ");
    e = s.next().charAt(0);

    System.out.println("Hacia donde quieres dibujar la piramide:\n1: Abajo\n2: Arriba\n3: Derecha");
    direccion = s.nextInt();

    switch (direccion) {
      case 1:
        System.out.println("  "+e);
        System.out.println(" "+e+e+e);
        System.out.println(""+e+e+e+e+e);
        break;
      case 2:
        System.out.println(""+e+e+e+e+e);
        System.out.println(" "+e+e+e);
        System.out.println("  "+e);
        break;
      case 3:
        System.out.println(e);
        System.out.println(""+e+e);
        System.out.println(""+e+e+e);
        System.out.println(""+e+e);
        System.out.println(e);
    }

    s.close();
  }
}
