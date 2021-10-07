import java.util.Scanner;

public class Ejercicio8TablaMultiplicar {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    
    int n=0;

    System.out.print("Introduce un numero:  ");
    n=s.nextInt();

    for(int i=1; i<=10; i++){
      System.out.print(n*i+"\t");
    }

    s.close();
  }
}
