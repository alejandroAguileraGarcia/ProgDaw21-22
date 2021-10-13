import java.util.Scanner;
import java.lang.Math;

public class Ejercicio09SegundoGrado {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    double a, b, c;
    double x1, x2;
    String solucion1, solucion2;
        
    System.out.println("Introduzca los coeficientes a, b y c de la expresion ax^2+bx+c=0 separados por un espacio:");
    a = s.nextDouble();
    b = s.nextDouble();
    c = s.nextDouble();

    if (a == 0 ) {
      if (b == 0) {
        System.out.println("Esto no es una ecuación.");
      } else {
        x1 = -c/b;
        System.out.println("La solución es:");
        System.out.println("x1 = "+x1);
      }      
    } else {
      double radicando;
      radicando = b*b-4*a*c;
      if (radicando >= 0) {
        x1 = (-b + Math.sqrt(radicando))/(2*a);
        x2 = (-b - Math.sqrt(radicando))/(2*a);
        System.out.println("Las soluciones son:");
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
      } else {
        solucion1 = ("" + -b/(2*a)+ " + " +(Math.sqrt(-radicando))/(2*a)+" i");
        solucion2 = ("" + -b/(2*a)+ " + " +(-Math.sqrt(-radicando))/(2*a)+" i");
        System.out.println("Las soluciones son:");
        System.out.println("x1 = " + solucion1);
        System.out.println("x2 = " + solucion2);
      }
      
    }

    s.close();
  }
}
