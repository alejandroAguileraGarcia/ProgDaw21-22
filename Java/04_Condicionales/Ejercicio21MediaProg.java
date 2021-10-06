import java.util.Scanner;

public class Ejercicio21MediaProg {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    float nota1;
    float nota2;
    float media;
    String recu="";

    System.out.print("Introduce la nota del primer examen: ");
    nota1 = s.nextFloat();

    System.out.print("Introduce la nota del segundo examen: ");
    nota2 = s.nextFloat();

    media=(nota1+nota2)/2;
/*
    Mi version:
    if (media>=5){
      System.out.printf("Tu nota en programacion es: %.2f",media);
    }else{
      System.out.println("¿Has aprobado el examen de programacion? (apto/no apto): ");
      recu=s.next();
      if (recu.equals("apto")){
        System.out.println("Tu nota en programacion es 5");
      }else{
        System.out.printf("Tu nota en programacion es: %.2f",media);
      }
    }
*/
    
    //Version mejorada: libro:

    if (media<5){
      System.out.println("¿Has aprobado el examen de programacion? (apto/no apto): ");
      recu=s.next();
      if (recu.equals("apto")){
        media = 5;
      }
    }

    System.out.printf("Tu nota en programacion es: %.2f",media);

    s.close();
  }
}
