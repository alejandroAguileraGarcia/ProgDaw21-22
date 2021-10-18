import java.util.Scanner;

public class Ejercicio24PiramideNumericaMejorada {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int alturaIntroducida = 0;
    int altura = 1;
    int numeroEspacios = 0;

    System.out.print("Introduce la altura de la piramide: ");
    alturaIntroducida = s.nextInt();

    numeroEspacios = alturaIntroducida-1;

    while(altura <= alturaIntroducida){
      /*Introducir espacios*/
      for(int k = 1; k <= numeroEspacios; k++){
        System.out.print(" ");
      }

      /*Introducir caracteres*/
      
      for(int k = 1; k < altura; k++){
        System.out.print(k);
      }
      for(int k = altura; k > 0; k--){
        System.out.print(k);
      }

      System.out.println();

      numeroEspacios--;
      altura++;
    }

    s.close();
  }
}