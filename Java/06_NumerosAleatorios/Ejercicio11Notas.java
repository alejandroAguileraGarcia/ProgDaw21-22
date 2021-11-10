public class Ejercicio11Notas {
  public static void main(String[] args) {
    
    int calificacion;
    String nota;

    int contadorSuspensos = 0;
    int contadorSuficientes = 0;
    int contadorBienes = 0;
    int contadorNotables = 0;
    int contadorSobresalientes = 0;

    for (int i = 0; i < 20; i++) {

      calificacion = (int) (Math.random() * 11);
      
      if (calificacion < 5){
        
        nota = "Suspenso";
        contadorSuspensos++;

      }else if (calificacion == 5){
        
        nota = "Suficiente";
        contadorSuficientes++;

      }else if (calificacion == 6){
        
        nota = "Bien";
        contadorBienes++;

      }else if (calificacion < 9){
        
        nota = "Notable";
        contadorNotables++;

      }else{
        
        nota = "Sobresaliente";
        contadorSobresalientes++;

      }
      
      System.out.println(nota);

    }

    System.out.printf("Hay %d Suspensos \n", contadorSuspensos);
    System.out.printf("Hay %d Suficientes \n", contadorSuficientes);
    System.out.printf("Hay %d Bienes \n", contadorBienes);
    System.out.printf("Hay %d Notables \n", contadorNotables);
    System.out.printf("Hay %d Sobresalientes \n", contadorSobresalientes);
    
  }
}
