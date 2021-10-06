public class Ejercicio07Media  {
  public static void main(String[] args){
    
    int nota1=0, nota2=0, nota3=0, media=0;
        
    System.out.println("Introduzca la primera nota:");
    nota1= Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca la segunda nota:");
    nota2= Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca la tercera nota:");
    nota3= Integer.parseInt(System.console().readLine());
    
    media=(nota1+nota2+nota3)/3;
    
    System.out.printf("La media es: %d \n",  media);
    
  }
}
