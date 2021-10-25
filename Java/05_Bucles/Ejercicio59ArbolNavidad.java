import java.util.Scanner;

public class Ejercicio59ArbolNavidad {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int altura;
    int espaciosDelanteros;
    int espaciosMedio = 1;
    int asteriscos;

    System.out.print("Introduce la altura (min 4): ");
    altura = s.nextInt();

    s.close();

    espaciosDelanteros = altura - 3; //Y * y -1

    for (int i = 1; i <= altura; i++){

      for (int j = espaciosDelanteros; j > 0; j--){

        System.out.print(".");

      }

      if (i == 1){

        System.out.println("*");

      }else if (i == 2){

        System.out.println("^");
        espaciosDelanteros--;

      }else if (i == (altura - 1)){

        asteriscos = (altura - 3) * 2 + 1;

        for (int j = 1; j <= asteriscos; j++){

          System.out.print("^");
          
        }

        espaciosDelanteros = altura - 3;

        System.out.println();

      }else if (i == altura){

        System.out.println("Y");

      }else{
        
        System.out.print("^");

        for (int j = 1; j <= espaciosMedio; j++){

          System.out.print(".");

        }
        
        System.out.println("^");

        espaciosDelanteros--;
        espaciosMedio += 2;
        
      }

    } //for

  }
}
