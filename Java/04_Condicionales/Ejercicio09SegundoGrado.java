import java.util.Scanner;
import java.lang.Math;

public class Ejercicio09SegundoGrado {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int a, b, c;
    double x1, x2, radical;
        
    System.out.println("Introduzca los coeficientes a, b y c de la expresion ax^2+bx+c=0 separados por un espacio:");
    a= s.nextInt();
    b= s.nextInt();
    c= s.nextInt();
    
    radical=(Math.pow(b,2)-4*a*c);

    if (radical>=0){
      x1=((-b+Math.sqrt(radical))/2*a);
      x2=((-b-Math.sqrt(radical))/2*a);
      System.out.printf("Las soluciones son %.2f y %.2f", x1, x2);
    }else{
      System.out.println("Coeficientes invalidos");
    }
    

    

    s.close();
  }
}
