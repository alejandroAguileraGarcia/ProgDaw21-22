package UNIDIMENSIONALES;
public class Ejercicio02 {
  public static void main(String[] args) {
    
    char[] array = new char[10];

    array[0] = 'a';
    array[1] = 'x';
    array[4] ='@';
    array[6] = ' ';
    array[7] = '+';
    array[8] = 'Q';

    for (int i = 0; i <  10; i++) {
      System.out.println(array[i]);
    }
  }
}