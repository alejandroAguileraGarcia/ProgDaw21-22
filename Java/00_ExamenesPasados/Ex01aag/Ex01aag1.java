/*Alejandro Aguilera García*/

import java.util.Scanner;

public class Ex01aag1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String caracterInicial;
    String caracterMedio;
    String caracterFinal;
    
    int nFilas;
    int nColumnas;

    int extremoInferior;
    int extremoSuperior;

    boolean entradaErronea;

    do {
      System.out.print("Introduzca el nº de filas [1-20]: ");
      nFilas = s.nextInt();
      
      entradaErronea = nFilas < 1 || nFilas > 20 ? true : false;

    } while (entradaErronea);

    do {
      System.out.print("Introduzca el nº de columnas [1-20]: ");
      nColumnas = s.nextInt();

      entradaErronea = nColumnas < 1 || nColumnas > 20 ? true : false;

    } while (entradaErronea);

    int [][] matriz = new int[nFilas][nColumnas];

    do {
      System.out.print("Introduzca el extremo inferior del intervalo aleatorio: ");
      extremoInferior = s.nextInt();

      System.out.print("Introduzca el extremo superior del intervalo aleatorio: ");
      extremoSuperior = s.nextInt();

      if (extremoSuperior - extremoInferior + 1 < nFilas * nColumnas) {
        entradaErronea = true;
        System.out.println("Cantidad de datos insuficiente.");

      }else entradaErronea = false;

    } while (entradaErronea);

    s.close();

    int longitudCeldas = 0;
    int numeroMayor = extremoSuperior;

    while (numeroMayor > 0){
      numeroMayor /= 10;
      longitudCeldas++;
    }

    String imprimir = "%" + String.valueOf(longitudCeldas) + "d│";

    for (int i = 0; i < nFilas; i++) {
      for (int j = 0; j < nColumnas; j++){
        int contador = 0;
        boolean repetir;
        
        do {
          repetir = false;
          
          matriz [i][j] = (int) (Math.random() * (extremoSuperior - extremoInferior + 1)) + extremoInferior;
          
          for (contador = 0; contador < nColumnas * i + j; contador++) {
            if (matriz [i][j] == matriz [contador / nColumnas][contador % nColumnas]) repetir = true;
          }
          
        }while (repetir);
      }
    }

    caracterInicial = "┌";
    caracterFinal = "┐";
    caracterMedio = "┬";

    System.out.print(caracterInicial);
    for (int k = 0; k < nColumnas; k++) {
      for (int j = 0; j < longitudCeldas; j++) System.out.print("─");

      if (k == nColumnas - 1) System.out.println(caracterFinal);
      else System.out.print(caracterMedio);
    }

    for (int i = 0; i < nFilas; i++) {
      if (i == nFilas - 1){
        caracterInicial = "└";
        caracterFinal = "┘";
        caracterMedio = "┴";

      } else {
        caracterInicial = "├";
        caracterFinal = "┤";
        caracterMedio = "┼";

      }

      System.out.print("│");
      for (int j = 0; j < nColumnas; j++){
        System.out.printf(imprimir, matriz[i][j]);
      }

      System.out.println();

      System.out.print(caracterInicial);
      for (int k = 0; k < nColumnas; k++) {
        for (int j = 0; j < longitudCeldas; j++) System.out.print("─");

        if (k == nColumnas - 1) System.out.println(caracterFinal);
        else System.out.print(caracterMedio);
      }

    }

  }
}