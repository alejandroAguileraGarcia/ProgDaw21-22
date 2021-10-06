import java.util.Scanner;

public class EjemploBucles {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int x=1;
    char r=' ';

    System.out.println("--------------------------------Bucle For--------------------------------");
    for (int i = 1; i <11; i++){
      System.out.println(i);
    }

    System.out.println("--------------------------------Bucle While--------------------------------");
    while (x<=10){
      System.out.println(x);
      x++;
    }


    System.out.println("--------------------------------Bucle Do-While --------------------------------");
    x=0;
    do{
      x++;
      System.out.println(x);
    }while (x<10);

    do{
      System.out.print("Dime un numero: ");
      x=s.nextInt();

      System.out.printf("Que bonito es el %d \n",x);

      System.out.print("¿Quieres continuar? (s/n)");
      r=s.next().charAt(0);;

    }while (r=='s');
    s.close();
  }
}
