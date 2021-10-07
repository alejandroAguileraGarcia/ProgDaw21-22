import java.util.Scanner;

public class Ejercicio09NumeroCifras {
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);

    boolean condicion=false;
    int n=0;
    int cifras=1;

    System.out.print("Introduce un numero: ");
    n=Math.abs(s.nextInt());

    for (int i=1; condicion==false ; i=i*10){
      if((n>=i)&&(n<(i*10))){
        System.out.printf("El numero tiene %d cifras", cifras);
        condicion=true;
      }else{
        cifras=cifras+1;
      }
    }

    s.close();
  }
}
