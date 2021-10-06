import java.util.Scanner;

public class Ejercicio11Hora {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int hour;
    int minute;
    int dayminutes=86400;
    int restminutes;

    System.out.println("Introduza la hora en horas y minutos separados por un espacio: ");
    hour = s.nextInt();
    minute = s.nextInt();

    //TODO Hacer ejercicio 12 con bucles

    restminutes= dayminutes - ((hour*60*60)+(minute*60));

    System.out.printf("Hasta la media noche quedan %d segundos", restminutes);

    s.close();
  }
}