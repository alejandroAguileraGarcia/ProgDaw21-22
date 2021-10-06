import java.util.Scanner;

public class Ejercicio02Horas {
  public static void main(String[] args) {      
    Scanner s = new Scanner(System.in);

    int hour;
    
    System.out.println("¿Que hora es?");
    hour=Integer.parseInt(s.nextLine());

    //21-5 noche 6-12 mañana 13-20 tarde

    if (hour>=6 && hour<=12){
      System.out.println("Buenos dias");
    }else if (hour>=13 && hour<=20){
      System.out.println("Buenas tardes");
    }else if ((hour>=21 && hour<=24)||(hour>=00 && hour<=5)){
      System.out.println("Buenas noches");
    }else {
      System.out.println("Hora no valida");
    }


    s.close();
  }
}