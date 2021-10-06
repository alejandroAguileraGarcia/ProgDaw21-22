public class Ejercicio7CharyStrings {
  public static void main(String[] args) {
    
    // int a=a; el valor del int es el codigo ascii de a;
    char c='C';
    char b='s';
    String casa="casa", de=" de ";
    

    // String.valueOf(b) para que no se produzca la suma del codigo ASCII y si la concatenacion de letras
    System.out.println(c+String.valueOf(b)+de+casa+b);
    
    
  }
}