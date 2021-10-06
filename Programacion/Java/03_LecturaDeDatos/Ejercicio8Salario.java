public class Ejercicio8Salario {
  public static void main(String[] args) {
      
    int precioHora=12;
    int horasSemanales;
    int salario;

    System.out.println("Introduzca la cantidad de horas trabajadas a la semana: ");
    horasSemanales=Integer.parseInt(System.console().readLine());

    salario=horasSemanales*precioHora;
    
    System.out.printf("El salario semanal corresponde a: %d euros", salario);
  }
}