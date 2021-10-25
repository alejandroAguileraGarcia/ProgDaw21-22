import java.util.Scanner;

public class Ejercicio50Ciento55 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int espacios;

    System.out.print("Introduce la altura (5 mínimo): ");
    altura = s.nextInt();
    System.out.print("Introduce el numero de espacios (2 mínimo): ");
    espacios = s.nextInt();

    s.close();

    for (int i = 1; i <= altura; i++) {

      System.out.print("*");

      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }

      if ((i==1)||(i==3)||(i==altura)){
        System.out.print("****");
      }else if (i==2){
        System.out.print("*   ");
      }else{
        System.out.print("   *");
      }

      for (int j = 0; j < espacios; j++) {
        System.out.print(" ");
      }

      if ((i==1)||(i==3)||(i==altura)){
        System.out.println("****");
      }else if (i==2){
        System.out.println("*   ");
      }else{
        System.out.println("   *");
      }

    }//For altura
  }
}
