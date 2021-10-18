import java.util.Scanner;

public class Ejercicio24PiramideNumerica {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int alturaIntroducida = 0;
    int altura = 1;
    int numeroEspacios = 0;
    int numeroCaracteresInteriores = 1;
    int dibujo = 1;

    System.out.print("Introduce la altura de la piramide: ");
    alturaIntroducida = s.nextInt();

    numeroEspacios = alturaIntroducida-1;

    while(altura <= alturaIntroducida){
      /*Introducir espacios*/
      for(int j = 1; j <= numeroEspacios; j++){
        System.out.print(" ");
      }

      /*Introducir caracteres*/
      
      if (altura == 1){
        System.out.print(dibujo);
        System.out.println();
      }else{
        for(int k = 1; k <= numeroCaracteresInteriores/2; k++){
          System.out.print(k);
          dibujo = dibujo+1;
        }
        for(int k = 0; k <= numeroCaracteresInteriores/2; k++){
          System.out.print(dibujo);
          dibujo = dibujo-1;
        }
        dibujo = 1;
        System.out.println();
      }

      numeroEspacios--;
      altura++;
      numeroCaracteresInteriores = numeroCaracteresInteriores + 2;
    }

    s.close();
  }
}
