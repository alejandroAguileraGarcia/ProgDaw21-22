public class Ejercicio03SumasAleatorios {
  public static void main(String[] args) {

    int [] [] numeros = new int [5] [6];

    for (int i = 0; i < 4; i++){

      numeros [i] [5] = 0;
      
      for (int j = 0; j < 5; j++){
        
        numeros [i] [j] = (int) (Math.random() * 900) + 100;
        numeros [i] [5] += numeros [i] [j];

      }

    }

    for (int j = 0; j < 6; j++){

      numeros [4] [j] = 0;

      for (int i = 0; i < 4; i++) numeros [4] [j] += numeros [i] [j];

    }

    for (int i = 0; i < 5; i++){

      for (int j = 0; j < 6; j++) System.out.printf("%7d",numeros[i] [j]);

      System.out.println();

    }
    
  }
}