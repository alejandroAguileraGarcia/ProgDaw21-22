import java.util.Scanner;

public class Ejercicio2Piramides {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int alturaIntroducida;
    int altura = 0;


    int numeroEspacios = 0;
    int caracter = 1;

    char caracter1;
    char caracter2;

    String orientacion;

    System.out.print("Introduce la altura de la piramide: ");
    alturaIntroducida = s.nextInt();

    s.nextLine();

    System.out.print("Introduzca la orientación (izquierda, derecha, arriba, abajo): ");
    orientacion = s.nextLine();

    System.out.print("Introduzca el primer caracter: ");
    caracter1 = s.next().charAt(0);

    s.nextLine();

    System.out.print("Introduzca el segundo caracter: ");
    caracter2 = s.next().charAt(0);

    s.close();

    switch (orientacion){
      case "arriba":
        numeroEspacios = alturaIntroducida-1;
        caracter = 1;
        altura = alturaIntroducida;
        break;
      case "abajo":
        numeroEspacios = 0;
        caracter = (alturaIntroducida - 1) * 2 + 1;
        altura = alturaIntroducida;
        break;
      case "derecha":
        numeroEspacios = 0;
        caracter = 1;
        altura = (alturaIntroducida - 1) * 2 + 1;
        break;
      case "izquierda":
        numeroEspacios = alturaIntroducida-1;
        caracter = 1;
        altura = (alturaIntroducida - 1) * 2 + 1;
        break;
      default:
        altura = 0;
        System.out.println("Orientacion erronea");
        break;
    }


    for (int i = 1; i <= altura; i++){

      for(int k = 1; k <= numeroEspacios; k++){

        System.out.print(" ");

      }//For espacios

      for(int k = 1; k <= caracter; k++){
        
        if (k % 2 == 0 && !orientacion.equals("derecha")){
          System.out.print(caracter2);
        }else if (k % 2 != 0 && !orientacion.equals("derecha")){
          System.out.print(caracter1);
        }

        if ((k+i) % 2 == 0 && orientacion.equals("derecha")){
          System.out.print(caracter2);
        }else if ((k+i) % 2 != 0 && orientacion.equals("derecha")){
          System.out.print(caracter1);
        }

      }//For caracteres

      System.out.println();

      switch (orientacion){
        case "arriba":
          numeroEspacios--;
          caracter += 2;
          break;
        case "abajo":
          numeroEspacios++;
          caracter -= 2;
          break;
        case "derecha":
        numeroEspacios = 0;
          if (i > (altura / 2)){
            caracter--;
          }else{
            caracter++;
          }
          break;
        case "izquierda":
          if (i > (altura / 2)){
            caracter--;
            numeroEspacios++;
          }else{
            caracter++;
            numeroEspacios--;
          }
          break;
        default:
          break;
      }//Switch

      

    }//For altura

  }
}