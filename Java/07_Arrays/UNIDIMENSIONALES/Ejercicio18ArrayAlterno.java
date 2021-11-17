package UNIDIMENSIONALES;
public class Ejercicio18ArrayAlterno {
  public static void main(String[] args) {
    
    int [] numeros = new int[10];
    int [] resultado = new int[10];

    int [] mayores = new int[10];
    int contMay = 0;
    int contMay2 = 0;

    int [] menores = new int[10];
    int contMen = 0;
    int contMen2 = 0;

    for (int i = 0; i < 10; i++){

      numeros[i] = (int) (Math.random() * 201);

      if (numeros[i] <= 100){
        menores[contMen] = numeros[i];
        contMen++;
      }else{ 
        mayores[contMay] = numeros[i];
        contMay++;
      }

    }

    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();

    int i = 0;
    
    while (contMay > 0 && contMen > 0) {

      if (i % 2 == 0) {
        resultado[i] = menores[contMen2];
        contMen2++;
        contMen--;
      }else{
        resultado[i] = mayores[contMay2];
        contMay2++;
        contMay--;
      }
      i++;
    }

    while (contMen > 0) {
      resultado [i] = menores[contMen2];
      contMen2++;
      i++;
      contMen--;
    }
    
    while (contMay > 0) {
      resultado [i] = mayores[contMay2];
      contMay2++;
      i++;
      contMay--;
    }

    for (int numero: resultado) System.out.print(numero + " ");
  }
}
