import java.util.Scanner;

public class Ejercicio10Horoscopo {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int day;
    int month;
    String horoscopo="";

    System.out.println("Introduzca su dia de nacimiento y el numero de mes separados por un espacio: ");
    day=s.nextInt();
    month=s.nextInt();
    
    switch(month){
      case 1:
        if (day>=20){
          horoscopo ="Acuario";
        }else{
          horoscopo ="Capricornio";
        }
        break;
      case 2:
        if (day>=19){
          horoscopo ="Piscis";
        }else{
          horoscopo ="Acuario";
        }
        break;
      case 3:
          if (day>=21){
            horoscopo ="Aries";
          }else{
            horoscopo ="Piscis";
          }
          break;
      case 4:
          if (day>=20){
            horoscopo ="Tauro";
          }else{
            horoscopo ="Aries";
          }
          break;
      case 5:
        if (day>=21){
          horoscopo ="Geminis";
        }else{
          horoscopo ="Tauro";
        }
        break;
      case 6:
        if (day>=21){
          horoscopo ="Cancer";
        }else{
          horoscopo ="Geminis";
        }
        break;
      case 7:
        if (day>=23){
          horoscopo ="Leo";
        }else{
          horoscopo ="Cancer";
        }
        break;
      case 8:
        if (day>=23){
          horoscopo ="Virgo";
        }else{
          horoscopo ="Leo";
        }
        break;
      case 9:
        if (day>=23){
          horoscopo ="Libra";
        }else{
          horoscopo ="Virgo";
        }
        break;
      case 10:
        if (day>=23){
          horoscopo ="Escorpio";
        }else{
          horoscopo ="Libra";
        }
        break;
      case 11:
        if (day>=22){
          horoscopo ="Sagitario";
        }else{
          horoscopo ="Escorpio";
        }
        break;
      case 12:
        if (day>=22){
          horoscopo ="Capricornio";
        }else{
          horoscopo ="Sagitario";
        }
        break;
    }
    System.out.println("Tu horoscopo: " + horoscopo);
    s.close();
  }
}