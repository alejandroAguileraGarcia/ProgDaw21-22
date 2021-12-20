import java.util.Scanner;

public class ExtraMediaArray {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int [][] numeros = new int [10] [10];
    int [][] media = new int [10] [10];
    int contador;
    String entrada;

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) numeros [i][j] = (int) (Math.random() * 300);
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) System.out.printf("%4d", numeros [i][j]);
      System.out.println();
    }

    do{
      System.out.println();
      for (int i = 0; i < 10; i++){
        for (int j = 0; j < 10; j++){
          contador = 0;
          media [i][j] = 0; 

          for (int k = i - 1; k <= i + 1; k++){
            for (int z = j - 1; z <= j + 1; z++){
              if (!(k == i && z == j) && k >= 0 && z >= 0 && k < 10 && z < 10){
                media [i][j] += numeros [k][z];
                contador++;
              }
  
            }
  
          }
  
          media [i][j] /= contador;
  
        }
  
      }

      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) System.out.printf("%4d", media [i][j]);
        System.out.println();
      }

      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) numeros [i][j] = media [i][j];
      }

      entrada = s.nextLine();

    } while (!entrada.equals("a"));

    s.close();

  }
}