public class Ejercicio5Pesetas {
    public static void main(String[] args) {
      
      double euros=0, pesetas=0, cambio=0;
      
      cambio=166.386;
      
      System.out.println("Introduzca las pesetas: ");
      
      pesetas=Double.parseDouble(System.console().readLine());
      
      euros=pesetas/cambio;
      
      System.out.printf("%.2f pesetas corresponden a %.2f euros", pesetas, euros);
      
      
    }
}
