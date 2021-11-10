public class Ejercicio15Melodia {
  public static void main(String[] args) {
    
    int numeroAleatorio;
    int longitudMelodia;
    int primeraNota = 0;
    String nota;

    longitudMelodia = (int) (Math.random() * 7 + 1);

    for (int i = 1; i <= longitudMelodia; i++) {
      
      for (int j = 0; j < 4; j++){
        numeroAleatorio = (int) (Math.random() * 7);

        if (i + j == 1) primeraNota = numeroAleatorio;

        if (i + j == longitudMelodia + 3) numeroAleatorio = primeraNota;

        switch (numeroAleatorio) {
          case 0:
            nota = " do ";
            break;
          case 1:
            nota = " re ";
            break;
          case 2:
            nota = " mi ";
            break;
          case 3:
            nota = " fa ";
            break;
          case 4:
            nota = " sol ";
            break;
          case 5:
            nota = " la ";
            break;
          case 6:
            nota = " si ";
            break;
          default:
            nota = " ";
        }

        System.out.print(nota);

      }

      System.out.print("|");

    }

    System.out.println("|");


  }
}
