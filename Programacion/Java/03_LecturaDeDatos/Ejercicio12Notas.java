import java.util.Scanner;

public class Ejercicio12Notas {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double n1;
    double n2;
    double nf;

    System.out.println("Introduzca la nota del primer examen: ");
    n1=s.nextDouble();

    System.out.println("Introduzca la nota que quieres sacar en el examen final: ");
    nf=s.nextDouble();
    
    //nf=n1*0.4+n2*0.6; == (nf-n1*0.4)/0.6=n2;

    n2=(nf-n1*0.4)/0.6;

    System.out.printf("En el segundo examen debes sacar un: %.2f", n2);
    s.close();
  }
}