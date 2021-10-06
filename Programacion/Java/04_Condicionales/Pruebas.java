import java.util.Scanner;

public class Pruebas {
  public static void main(String[] args) {   
    Scanner s = new Scanner(System.in);

    int hour;
    int minutes;
    int dayMinutes=1440;
    int totalMinutes;

    System.out.println("¿Que dia de la semana es?");

    System.out.println("¿Que hora es en horas y minutos separados por un espacio ?");
    hour= s.nextInt();
    minutes= s.nextInt();
    s.nextLine();

    totalMinutes= (dayMinutes-minutes-(hour*60));

    System.out.println(totalMinutes);
    s.close();
  }
}