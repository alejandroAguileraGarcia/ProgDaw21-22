import java.util.Scanner;

public class Ejercicio30PeceraTriple {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int anchura;

    int posicion = 0;

    int posicion1;
    int posicion2;
    int posicion3;

    System.out.print("Introduzca la altura de la pecera: ");
    altura = s.nextInt();

    System.out.print("Introduzca la anchura de la pecera: ");
    anchura = s.nextInt();

    s.close();

    posicion1 = (int) (Math.random() * (anchura - 2) * (altura - 2));

    do {

      posicion2 = (int) (Math.random() * (anchura - 2) * (altura - 2));
      posicion3 = (int) (Math.random() * (anchura - 2) * (altura - 2));

    } while (posicion1 == posicion2 || posicion2 == posicion3 || posicion1 == posicion3);

    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= anchura; j++){
        if (i == 1 || i == altura || j == 1 || j == anchura) System.out.print("* ");
        else {
          System.out.print(
            posicion == posicion1 ? "& " 
            : posicion == posicion2 ? "$ " 
            : posicion == posicion3 ? "@ " 
            : "  ");
          posicion++;
        }
      }
      System.out.println();
    }

  }
}

/*
else if (posicion == posicion1){
          System.out.print("& ");
          posicion++;
        }else if (posicion == posicion2){
          System.out.print("@ ");
          posicion++;
        } else if (posicion == posicion3){
          System.out.print("$ ");
          posicion++;
        }else{
          System.out.print("  ");
          posicion++;
        } */