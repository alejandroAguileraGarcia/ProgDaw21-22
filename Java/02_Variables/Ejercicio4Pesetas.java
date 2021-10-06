public class Ejercicio4Pesetas {
    public static void main(String[] args) {
      
      double euros=0, pesetas=0, cambio=0;
      
      cambio=166.386;
      
      System.out.println("Introduzca los euros: ");
      
      
      
      euros=Double.parseDouble(System.console().readLine());
      
      pesetas=euros*cambio;
      
      System.out.println(euros + " euros corresponden a "+ pesetas +" pesetas");
      
      
    }
}
