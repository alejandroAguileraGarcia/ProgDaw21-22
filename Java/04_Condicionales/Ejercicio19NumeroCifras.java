import java.util.Scanner;

public class Ejercicio19NumeroCifras {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int n;

    /*

    Mi solucion: 

    System.out.println("Introduce un numero de como mucho 5 cifras: ");
    n = s.nextInt();

    if ((-10<n)&&(10>n)){
      System.out.println("El numero tiene una sola cifra");
    }else if (((-100<n)&&(-10>=n))||((100>n)&&(10<=n))){
      System.out.println("El numero tiene dos cifras");
    }else if (((-1000<n)&&(-100>=n))||((1000>n)&&(100<=n))){
      System.out.println("El numero tiene tres cifras");
    }else if (((-10000<n)&&(-1000>=n))||((10000>n)&&(1000<=n))){
      System.out.println("El numero tiene cuatro cifras");
    }else if (((-100000<n)&&(-10000>=n))||((100000>n)&&(10000<=n))){
      System.out.println("El numero tiene cinco cifras");
    }
  
    */

    System.out.println("Introduce un numero de como mucho 5 cifras: ");
    n = Math.abs(s.nextInt());

    if (10>n){
      System.out.println("El numero tiene una sola cifra");
    }else if ((100>n)&&(10<=n)){
      System.out.println("El numero tiene dos cifras");
    }else if ((1000>n)&&(100<=n)){
      System.out.println("El numero tiene tres cifras");
    }else if ((10000>n)&&(1000<=n)){
      System.out.println("El numero tiene cuatro cifras");
    }else if ((100000>n)&&(10000<=n)){
      System.out.println("El numero tiene cinco cifras");
    }

    s.close();
  }
}
