import java.util.Scanner;

public class Ejercicio04Salario {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int precioHora=12;
    int precioHoraExtra=16;
    int horasSemanales;
    int salario;

    System.out.println("Introduzca la cantidad de horas trabajadas a la semana: ");
    horasSemanales=s.nextInt();
    
    if(horasSemanales<=40){
      salario=horasSemanales*precioHora;
    }else{
      salario=40*precioHora+((horasSemanales-40)*precioHoraExtra);
    }
    
    System.out.printf("El salario semanal corresponde a: %d euros", salario);
    
    s.close();
  }
}
