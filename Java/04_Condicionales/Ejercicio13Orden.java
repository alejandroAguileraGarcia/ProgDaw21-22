import java.util.Scanner;

public class Ejercicio13Orden {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int a;
    int b;
    int c;
    int aux;

    System.out.println("Introduce tres numeros enteros separados por un espacio: ");
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();

    if (b>a){
      aux=a;
      a=b;
      b=aux;
    }

    if(c>b){
      aux=b;
      b=c;
      c=aux;
    }

    if(b>a){
      aux=a;
      a=b;
      b=aux;
    }

    System.out.println(a+" "+b+" "+c);

    s.close();
  }
}