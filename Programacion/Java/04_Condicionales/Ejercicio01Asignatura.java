import java.util.Scanner;

public class Ejercicio01Asignatura {
  public static void main(String[] args) {      
    Scanner s = new Scanner(System.in);

    String day, lesson;
    
    System.out.println("¿Que dia es hoy?");
    day=s.nextLine();

    switch(day) {
      case "lunes":
        lesson="BBDD";
        System.out.println(lesson);
        break;
      case "martes":
        lesson="LLMM";
        System.out.println(lesson);
        break;
      case "miercoles":
        lesson="PROG";
        System.out.println(lesson);
        break;
      case "jueves":
        lesson="FOL";
        System.out.println(lesson);
        break;
      case "viernes":
        lesson="EEDD";
        System.out.println(lesson);
        break;
      default:
        System.out.println("Dia no valido");
        break;
    }


    s.close();
  }
}