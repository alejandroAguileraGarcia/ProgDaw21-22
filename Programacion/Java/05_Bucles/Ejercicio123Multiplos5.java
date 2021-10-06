public class Ejercicio123Multiplos5 {
  public static void main(String[] args){

    System.out.println("--------------------------------Bucle For--------------------------------");
    for (int i = 0; i <=100; i=i+5){
      if(i%5==0){
        System.out.println(i);
      }
    }

    System.out.println("--------------------------------Bucle While--------------------------------");
    int x=0;
    while (x<=100){
      if(x%5==0){
        System.out.println(x);
      }
      x=x+5;
    }

    System.out.println("--------------------------------Bucle Do While--------------------------------");
    x=0;
    do{
      if(x%5==0){
        System.out.println(x);
      }
      x=x+5;
    }while (x<=100);
  }
}
