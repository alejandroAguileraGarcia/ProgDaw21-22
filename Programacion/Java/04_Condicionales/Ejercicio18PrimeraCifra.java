import java.util.Scanner;

public class Ejercicio18PrimeraCifra {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int n;
    int primeraCifra=0;

    System.out.println("Introduce un numero de como mucho 5 cifras: ");
    n = s.nextInt();

    if (n/1<10){
      primeraCifra= n/1;
    }else if (n/10<10){
      primeraCifra= n/10;
    }else if (n/100<10){
      primeraCifra= n/100;
    }else if (n/1000<10){
      primeraCifra= n/1000;
    }else if (n/10000<10){
      primeraCifra= n/10000;
    }

    System.out.printf("La primera cifra es: %d", primeraCifra);

    s.close();
  }
}
