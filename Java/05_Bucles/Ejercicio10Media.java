import java.util.Scanner;

public class Ejercicio10Media {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    double media = 0;
    double n = 0;
    double d = 0;
    double suma = 0;


    while(n >= 0){
      System.out.print("Introduce un numero: ");
      n = s.nextInt();
      
      if (n>=0){
        suma = suma + n;
        d++;
      }
      
    }

    media = suma/d;
    System.out.println(media);

    s.close();
  }
}
