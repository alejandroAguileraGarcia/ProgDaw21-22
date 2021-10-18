import java.util.Scanner;

public class Ejercicio22MinutosFinde {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int hour;
    int minutes;
    int dayMinutes=1440;
    int dayMinutesUntilThree = 900 ;
    int totalMinutes=0;
    int diaNumerico=0;
    String day ="";

    System.out.println("¿Que dia de la semana es?");
    day = s.nextLine();

    System.out.println("¿Que hora es en horas y minutos separados por un espacio ?");
    hour= s.nextInt();
    minutes= s.nextInt();
    s.nextLine();

    switch(day){
      case "lunes":
        diaNumerico=4;
        break;
      case "martes":
        diaNumerico=3;
        break;
      case "miercoles":
        diaNumerico=2;
        break;
      case "jueves":
        diaNumerico=1;
        break;
      case "viernes":
        diaNumerico=0;
        break;
      default:
        System.out.println("Dia no valido");
        break;
    }

    totalMinutes= ((dayMinutesUntilThree-minutes-(hour*60))+dayMinutes*diaNumerico);

    System.out.printf("Quedan %d minutos hasta el fin de semana", totalMinutes);

    s.close();
  }
}