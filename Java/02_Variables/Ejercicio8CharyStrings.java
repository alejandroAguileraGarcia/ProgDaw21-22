public class Ejercicio8CharyStrings {
    public static void main(String[] args) {
      
      char a='a',b='b',c='c',d='d',e='e';
      String abc="";

      //"" para poder concatenar char y que no de error, ya que necesitamos un "contenedor" vacia para almacenar los char
      abc=""+a+b+c+d+e;      
      
      System.out.println(abc);
      
      
    }
}