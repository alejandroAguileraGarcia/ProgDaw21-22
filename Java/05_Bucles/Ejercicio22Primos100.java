public class Ejercicio22Primos100 {
  public static void main(String[] args){

  int numeroDivisores = 0;

    for(int i = 2; i <= 100; i++){
      for (int j = 1; j <= i; j++) {

        if((i % j) == 0){
          numeroDivisores++;
        }

      }

      if (numeroDivisores == 2){
        System.out.print(i + "\t");
      }

      numeroDivisores = 0;
      
    }
  }
}
