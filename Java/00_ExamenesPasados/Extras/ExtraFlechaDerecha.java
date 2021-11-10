import java.util.Scanner;

public class ExtraFlechaDerecha {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int grosor;
    int longitud = 0;
    int longitudIntroducida;

    System.out.print("Introduce el grosor de la flecha: ");
    grosor = s.nextInt();

    System.out.print("Introduce la longitud de la flecha: ");
    longitudIntroducida = s.nextInt();

    s.close();

    for (int i = 0; i <= (grosor + 1); i++) {

      if (i == 0||i==grosor+1){
        longitud = longitudIntroducida - (1 + grosor/2);
        for (int j = 0; j < longitud ;j++){
          System.out.print(" ");
        }
        System.out.println ("*");
        longitud += 3;
      }else{
        for (int j = 1; j < longitud ;j++){
          System.out.print("*");
        }
        
        if(i > grosor/2){
          longitud--;
        }else{
          longitud++;
        }
        
        System.out.println();
      }//Else
    }//For grosor
  }
}