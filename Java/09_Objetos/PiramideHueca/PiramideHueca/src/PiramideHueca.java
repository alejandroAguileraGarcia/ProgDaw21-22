import java.util.Scanner;

public class PiramideHueca {
  
  //atributos

  private int altura;
  private char caracter;

  //metodos

  public PiramideHueca (int altura, char caracter) {
    if (altura < 0) this.altura = -altura;
    else this.altura = altura;
    
    this.caracter = caracter;
  }

  public void cambiarCaracter (char caracter) {
    this.caracter = caracter;
  }

  public void cambiarAltura (int altura) {
    this.altura = altura;
  }

  public String toString () {

    String salida = "";
    int h = this.altura;
    int numeroEspacios = 0;
    int numeroEspaciosInteriores = 0;
    char c = this.caracter;

    numeroEspacios = h-1;
    for (int i = 1; i < h; i++){

      /*Introducir espacios*/
      for(int j = 1; j <= numeroEspacios; j++){
        salida = salida + " ";
      }

      /*Introducir caracteres*/
      salida = salida + c;

      for(int k = 1; k < numeroEspaciosInteriores; k++){
        salida = salida + " ";
      }

      if (i>1){
        salida = salida + c ;
      }

      salida = salida + "\n";

      numeroEspacios--;
      numeroEspaciosInteriores += 2;
    }

    /*Base piramide*/
    for(int i = 0; i < h; i++){
      salida = salida + c + " ";
    }

    return salida;
  }

}
