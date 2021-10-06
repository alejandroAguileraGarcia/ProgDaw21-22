public class Ejercicio456CuentaAtras {
  public static void main(String[] args){

    System.out.println("--------------------------------Bucle For--------------------------------");
    for (int i = 320; i >=160; i=i-20){
      System.out.println(i);
    }

    System.out.println("--------------------------------Bucle While--------------------------------");
    int x=320;
    while (x>=160){
      System.out.println(x);
      x=x-20;
    }

    System.out.println("--------------------------------Bucle Do While--------------------------------");
    x=320;
    do{  
      System.out.println(x);
      x=x-20;
    }while (x>=160);
  }
}
