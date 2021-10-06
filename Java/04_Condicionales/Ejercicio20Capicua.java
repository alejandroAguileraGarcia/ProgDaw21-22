import java.util.Scanner;

public class Ejercicio20Capicua {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int n;
    int unidades=0;
    int decenas=0;
    int centenas=0;
    int unidadesMillar=0;
    int decenasMillar=0;
    boolean capicua=false;

    System.out.println("Introduce un numero de como mucho 5 cifras: ");
    n = s.nextInt();

    s.nextLine();

    //Una cifra
    if (n<10){
      capicua= true;
    }
    
    //Dos cifras
    if ((n>=10)&&(n<100)){
      unidades=n%10;
      decenas=n/10;
      capicua=(unidades==decenas);
    }
    
    //Tres cifras
    if ((n>=100)&&(n<1000)){
      unidades=n%10;
      centenas=n/100;
      capicua=(unidades==centenas);
    }
    
    //Cuatro cifras
    if ((n>=1000)&&(n<10000)){
      unidades=n%10;
      decenas=(n/10)%10;
      centenas=(n/100)%10;
      unidadesMillar=n/1000;
      capicua=((unidades==unidadesMillar)&&(decenas==centenas));
    }
    
    //Cinco cifras
    if ((n>=10000)&&(n<100000)){
      unidades=n%10;
      decenas=(n/10)%10;
      unidadesMillar=(n/1000)%10;
      decenasMillar=n/10000;
      capicua=((unidades==decenasMillar)&&(decenas==unidadesMillar));
    }

    if(capicua){
      System.out.println("El numero es capicua");
    }else{
      System.out.println("El numero no es capicua");
    }

    s.close();
  }
}
