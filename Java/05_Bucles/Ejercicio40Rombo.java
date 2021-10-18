import java.util.Scanner;

public class Ejercicio40Rombo {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int altura = 0;
    int espaciosDelanteros = 0;
    int espaciosInteriores = -1;

    System.out.print("Introduce la altura del rombo: ");
    altura = s.nextInt();

    s.close();

    espaciosDelanteros = altura / 2;
    for(int i = 1; i <= altura; i++){
      for(int j = 0; j < espaciosDelanteros; j++){
        System.out.print(" ");
      }
      
      System.out.print("*");

      for(int j = 1; j <= espaciosInteriores; j++){
        System.out.print(" ");
      }

      if ((i != 1)&&(i != altura)){
        System.out.print("*");
      }

      System.out.println();

      if (i< ((altura / 2)+1)){   
        espaciosDelanteros --;
        espaciosInteriores +=2;
      }else{
        espaciosDelanteros ++;
        espaciosInteriores -=2;
      }
    }
  }
}
