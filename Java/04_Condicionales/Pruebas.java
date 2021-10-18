import java.util.Scanner;

public class Pruebas {
  public static void main(String[] args) {   
    Scanner s = new Scanner(System.in);

    String palabra ="m";

    int numeroMayor = 100;
    int numeroMenor = 0;
    int numero = 100;

    do{
      if(palabra.equals("M")){
        numeroMenor = numero;
      }else if (palabra.equals("m")){
        numeroMayor = numero;
      }
      
      numero = (numeroMenor + numeroMayor)/2;

      System.out.printf("¿El numero es %d (s/M/m)?: ", numero);
      palabra = s.nextLine();

      
    }while((palabra.equals("M"))||(palabra.equals("m")));
    
    System.out.println(numero);

    s.close();
  }
}