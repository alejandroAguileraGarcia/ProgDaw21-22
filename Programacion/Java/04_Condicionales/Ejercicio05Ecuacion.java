import java.util.Scanner;

public class Ejercicio05Ecuacion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int a,b;
    double x;

    System.out.println("Introduzca los coeficientes a y b de ax+b=0 separados por un espacio: ");
    a=s.nextInt();
    b=s.nextInt();
    
    if (a!=0){
      x=((double)(-b))/((double)a);
      System.out.printf("La solucion es: %.3f", x);
    }else{
      System.out.printf("Esta ecuacion no tiene solucion real");
      }
    
    s.close();
  }
}
