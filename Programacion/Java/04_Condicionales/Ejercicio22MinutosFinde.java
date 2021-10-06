import java.util.Scanner;

public class Ejercicio22MinutosFinde {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    int hour;
    int minutes;
    int dayMinutes=1440;
    int dayMinutesUntilThree = 900 ;
    int totalMinutes=0;
    String day ="";

    System.out.println("¿Que dia de la semana es?");
    day = s.nextLine();

    System.out.println("¿Que hora es en horas y minutos separados por un espacio ?");
    hour= s.nextInt();
    minutes= s.nextInt();
    s.nextLine();

    switch(day){
      case "lunes":
        totalMinutes= ((dayMinutesUntilThree-minutes-(hour*60))+dayMinutes*4);
        break;
      case "martes":
        totalMinutes= ((dayMinutesUntilThree-minutes-(hour*60))+dayMinutes*3);
        break;
      case "miercoles":
        totalMinutes= ((dayMinutesUntilThree-minutes-(hour*60))+dayMinutes*2);
        break;
      case "jueves":
        totalMinutes= ((dayMinutesUntilThree-minutes-(hour*60))+dayMinutes);
        break;
      case "viernes":
        totalMinutes= (dayMinutesUntilThree-minutes-(hour*60));
        break;
      default:
        System.out.println("Dia no valido");
        break;
    }

    System.out.printf("Quedan %d minutos hasta el fin de semana", totalMinutes);

    s.close();
  }
}