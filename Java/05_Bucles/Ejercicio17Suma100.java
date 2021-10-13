import java.util.Scanner;

public class Ejercicio17Suma100 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numeroIntroducido;
    int suma=0;

    System.out.print("Introduce un numero: ");
    numeroIntroducido = s.nextInt();

    for(int i=(numeroIntroducido+1); i<(numeroIntroducido+101); i++){
      suma = suma+ i;
    }
    
    System.out.println(suma);
    s.close();
  }
}
