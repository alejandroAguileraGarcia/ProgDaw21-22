import java.util.Scanner;

public class Ejercicio29Tiempo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int estacion;
    int tempMin;
    boolean soleado = true;
    int numeroAleatorio;
    int tempMax;

    int maxAbs;
    int minAbs;
    int intervalo;

    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");

    System.out.print("Seleccione la estacion del año: ");
    estacion = s.nextInt();

    s.close();

    numeroAleatorio = (int) (Math.random() * 10) + 1;

    switch (estacion){
      case 1:
        maxAbs = 30;
        minAbs = 15;
        intervalo = 16;
        if (numeroAleatorio <= 4) soleado = false;
        break;
      case 2:
        maxAbs = 45;
        minAbs = 25;
        intervalo = 21;
        if (numeroAleatorio <= 2) soleado = false;
        break;
      case 3:
        maxAbs = 30;
        minAbs = 20;
        intervalo = 11;
        if (numeroAleatorio <= 6) soleado = false;
        break;
      case 4:
        maxAbs = 25;
        minAbs = 0;
        intervalo = 26;
        if (numeroAleatorio <= 8) soleado = false;
        break;
      default:
        minAbs = 0;
        maxAbs = 0;
        intervalo = 0;
        break;
    }

    tempMin = (int) (Math.random() * intervalo) + minAbs;
    tempMax = (int) (Math.random() * (maxAbs - tempMin)) + tempMin;

    System.out.println("Temperatura mínima: " + tempMin);
    System.out.println("Temperatura máxima: " + tempMax);
    System.out.println(soleado ? "Soleado" : "Nublado");

  }
}
