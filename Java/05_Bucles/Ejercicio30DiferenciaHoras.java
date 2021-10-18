import java.util.Scanner;

public class Ejercicio30DiferenciaHoras {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    String dia1;
    String dia2;

    int diaNumerico1 = 0;
    int diaNumerico2 = 0;

    int hora1;
    int hora2;

    int cantidadHoras = 0;

    int cantidadHoras1 = 0;
    int cantidadHoras2 = 0;

    boolean error = false;

    System.out.println("Introduzca la primera fecha: ");
    System.out.print("Dia: ");
    dia1 = s.nextLine();
    System.out.print("Hora: ");
    hora1 = s.nextInt();

    s.nextLine();

    System.out.println("Introduzca la segunda fecha: ");
    System.out.print("Dia: ");
    dia2 = s.nextLine();
    System.out.print("Hora: ");
    hora2 = s.nextInt();

    switch (dia1){
      case "1":
      case "lunes":
        diaNumerico1 = 1;
        break;
      case "2":
      case "martes":
        diaNumerico1 = 2;
        break;
      case "3":
      case "miercoles":
        diaNumerico1 = 3;
        break;
      case "4":
      case "jueves":
        diaNumerico1 = 4;
        break;
      case "5":
      case "viernes":
        diaNumerico1 = 5;
        break;
      case "6":
      case "sabado":
        diaNumerico1 = 6;
        break;
      case "7":
      case "domingo":
        diaNumerico1 = 7;
        break;
      default:
        error = true;
        break;
    }

    switch (dia2){
      case "1":
      case "lunes":
        diaNumerico2 = 1;
        break;
      case "2":
      case "martes":
        diaNumerico2 = 2;
        break;
      case "3":
      case "miercoles":
        diaNumerico2 = 3;
        break;
      case "4":
      case "jueves":
        diaNumerico2 = 4;
        break;
      case "5":
      case "viernes":
        diaNumerico2 = 5;
        break;
      case "6":
      case "sabado":
        diaNumerico2 = 6;
        break;
      case "7":
      case "domingo":
        diaNumerico2 = 7;
        break;
      default:
        error = true;
        break;
    }

    if ((hora1 > 23)||(hora1 < 0)||(hora2 > 23)||(hora2 < 0)||(diaNumerico2 < diaNumerico1)||((diaNumerico2 == diaNumerico1)&&(hora2 < hora1))){
      error = true;
    }

    /*
    if (error == false){
      cantidadHoras = ((diaNumerico2 - diaNumerico1)*24);

      if (hora1 < hora2){
        cantidadHoras = cantidadHoras + hora2 - hora1;
      }else{
        cantidadHoras = cantidadHoras + hora1 - 24 + hora2;
      }
      System.out.println(cantidadHoras);
    }else{
      System.out.println("Datos invalidos");
    }*/

    if (error == false){
      cantidadHoras1 = ((diaNumerico1-1)*24)+hora1;
      cantidadHoras2 = ((diaNumerico2-1)*24)+hora2;

      cantidadHoras = cantidadHoras2 - cantidadHoras1;
      
      System.out.println(cantidadHoras);
    }else{
      System.out.println("Datos invalidos");
    }

    s.close();
  }
}