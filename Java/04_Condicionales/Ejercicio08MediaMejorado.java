import java.util.Scanner;

public class Ejercicio08MediaMejorado {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int nota1, nota2, nota3;
    double media=0;
    String boletin="";
        
    System.out.println("Introduzca la primera nota:");
    nota1= s.nextInt();
    
    System.out.println("Introduzca la segunda nota:");
    nota2= s.nextInt();
    
    System.out.println("Introduzca la tercera nota:");
    nota3= s.nextInt();
    
    media=(((double)(nota1))+((double)(nota2))+((double)(nota3)))/3;
    
    System.out.printf("La media es: %.3f \n",  media);

    if (media>=9){
      boletin="Sobresaliente";
    }else if((media>=7)&&(media<9)){
      boletin="Notable";
    }else if ((media>=6)&&(media<7)){
      boletin="Bien";
    }else if ((media>=5)&&(media<6)){
      boletin="Suficiente";
    }else if (media<5){
      boletin="Insuficiente";
    }

    System.out.printf("La nota en el boletin sera de: %s", boletin);

    s.close();
  }
}
