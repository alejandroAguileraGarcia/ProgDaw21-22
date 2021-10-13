import java.util.Scanner;

public class Ejercicio21SecuenciaNumeros {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int numeroIntroducido = 0;

    do{
      System.out.print("Introduce un numero:");
      numeroIntroducido = s.nextInt();
    }while(numeroIntroducido >= 0);
    
    s.close();
  }
}
