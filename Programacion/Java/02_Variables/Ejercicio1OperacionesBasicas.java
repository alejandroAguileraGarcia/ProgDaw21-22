public class Ejercicio1OperacionesBasicas {
    public static void main(String[] args) {
      
      int x, y, suma, resta, multiplicacion;
      float division;
      
      x=144;
      y=999;
      
      suma=x+y;
      resta=x-y;
      multiplicacion=x*y;
      division= (float) x / (float) y;
      
      System.out.printf("La suma es: %d\n", suma);
      System.out.printf("La resta es: %d\n", resta);
      System.out.printf("La multiplicacion es: %d\n", multiplicacion);
      System.out.printf("La division es: %.3f\n", division);
      
    }
}
